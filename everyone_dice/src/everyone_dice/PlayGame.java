package everyone_dice;

import javax.swing.JOptionPane;

public class PlayGame extends Thread 
{
   
   public static boolean switchOfPlayGame; //���� ������ �Ǵ�
   public static boolean switchOfThrowDiceTurn; //�ֻ����� ��������
   public static boolean switchOfMoveMalTurn;// ���̵� ��
   public static boolean switchOfPlayRun; //�÷�����ì
   public static boolean[] switchOfBoardClik = new boolean[19]; //Ŭ�� 
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
      JOptionPane.showMessageDialog(BoardPanel.instence, (playUser + 1)+ "P�� ���� �Դϴ�.");

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

      BoardPanel.textPane.setText("�ֻ��� ������ ��ư�� Ŭ���ϼ���.");
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
      
      
      BoardPanel.textPane.setText("���� �̵��ϼ���.");
      
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