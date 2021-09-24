package everyone_dice;

import javax.swing.JOptionPane;

public class PlayGame extends Thread 
{
   
   public static boolean switchOfPlayGame; //게임 진행중 판단
   public static boolean switchOfThrowDiceTurn; //주사위를 던지는턴
   public static boolean switchOfMoveMalTurn;// 말이동 턴
   public static boolean switchOfPlayRun; //플레이진챙
   public static boolean[] switchOfBoardClik = new boolean[19]; //클릭 
   public static boolean[][] switchOfEndBoardClick = new boolean[2][2];

   public static final int USER1 = 0;
   public static final int USER2 = 1;
   public static int playUser;
   
  
   public static boolean switchOfThrowBtn; 
   public static boolean switchOfMoveClick; 
   public static boolean switchOfOneMore;

   public PlayGame() 
   {
      Swi swi = new Swi();
      swi.start();
   }

   public void run() 
   {
      switchOfPlayGame = true;
      
      while (switchOfPlayGame) 
      {
         userStart(USER1);
         if (!switchOfPlayGame)
            break;
         userStart(USER2);
      }
   }

   public void userStart(int user) 
   {
      switchOfPlayRun = true;

      Data.dataInit();

      playUser = user;
      JOptionPane.showMessageDialog(BoardPanel.instence, (playUser + 1)+ "P의 차례 입니다.");

      while (switchOfPlayRun) 
      {
         
    	  throwdice();
         if (!switchOfPlayRun) 
         {
            break;
         }
         
         moveMal();
      }
   }

   public void throwdice() {
	   switchOfThrowDiceTurn = true;
      switchOfMoveMalTurn = false;

      BoardPanel.textPane.setText("주사위 던지기 버튼을 클릭하세요.");
      while (switchOfThrowDiceTurn) {

        
         while (!switchOfThrowBtn) {
            try {
               Thread.sleep(100);
            } catch (InterruptedException e) {
              
               e.printStackTrace();
            }
         }
         switchOfThrowBtn = false;

         int resultIndex = -1; 
         for (int i = 0; i < 3; i++) {
            if (Data.reultOfDice[playUser][i] == 0) {
               resultIndex = i;
               break;
            }
         }


         if (Data.nowResultOfDice != 0) {
           
            if (resultIndex != -1) {
               Data.reultOfDice[playUser][resultIndex] = Data.nowResultOfDice;

               if (Data.nowResultOfDice!= 7 && Data.nowResultOfDice != 8) {
                  break;
               } 
            } else {
               break;
            }
         } 
         
      }
      switchOfThrowDiceTurn = false;
   }

   public static void moveMal() {
      switchOfMoveMalTurn = true;
      switchOfThrowDiceTurn = false;
      
      
      BoardPanel.textPane.setText("말을 이동하세요.");
      
      while (switchOfMoveMalTurn) 
      {
    	  
         while (!switchOfMoveClick) {
            try {
               Thread.sleep(100);
            } catch (InterruptedException e) {

               e.printStackTrace();
            }
         }
        
         switchOfMoveClick = false;


         if (!switchOfOneMore) 
         {
            int count = 0;
            for (int i = 0; i < 1; i++) {
               if (Data.reultOfDice[PlayGame.playUser][i] == 0) {
                  count++;
               }
            }
            if (count == 1) {
               switchOfMoveMalTurn = false;
               switchOfPlayRun = false;
               break;
            }
         }
         else{
            switchOfMoveMalTurn = false;
            switchOfOneMore = false;
         }
      }
   }
}