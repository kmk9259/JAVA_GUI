package everyone_dice;

import javax.swing.JOptionPane;

public class Swi extends Thread  //스위치를 관리하는 스레드 이용 , 던지기와, 결과 선택을 false로 바꾸면 버튼 사용금지
{
	   
	   public void run() 
	   {
	      while (true) {
	         try {
	            Thread.sleep(100);
	         } catch (InterruptedException e) {
	        
	            e.printStackTrace();
	         }

	         for (int i = 0; i < 1; i++) {
	            BoardPanel.diceResultButton[i].setText(""
	                  + Data.reultOfDice[PlayGame.playUser][i]);
	            if (PlayGame.switchOfMoveMalTurn) {
	               if (Data.reultOfDice[PlayGame.playUser][i] == 0)
	                  BoardPanel.diceResultButton[i].setEnabled(false);
	               else
	                  BoardPanel.diceResultButton[i].setEnabled(true);
	            }
	            else
	               BoardPanel.diceResultButton[i].setEnabled(false);
	         }

	         if (PlayGame.switchOfThrowDiceTurn)
	            BoardPanel.throwBtn.setEnabled(true);
	         else
	            BoardPanel.throwBtn.setEnabled(false);
        
	         if(Data.choichResultIndex != -1){
	            int index = BoardPanel.mal[PlayGame.playUser][Data.choiceMalIndex].getBoardIndex();
	            int result = Data.reultOfDice[PlayGame.playUser][Data.choichResultIndex];
	            SelectPan pan = new SelectPan(index);
	            int s = pan.select(pan, true, result);
	            int l = pan.select(pan, false, result);
	            if(s != -1)
	               BoardPanel.selectBoard.setLocation(BoardPanel.boardPosX[s], BoardPanel.boardPosY[s]);
	            else{
	               int x = BoardPanel.endPosX[PlayGame.playUser][Data.choiceMalIndex];
	               int y = BoardPanel.endPosY[PlayGame.playUser][Data.choiceMalIndex];
	               BoardPanel.selectBoard.setLocation(x,y);
	            
	            }
	            if(l != -1)
	               BoardPanel.selectBoard.setLocation(BoardPanel.boardPosX[l], BoardPanel.boardPosY[l]);
	            else{
	               int x = BoardPanel.endPosX[PlayGame.playUser][Data.choiceMalIndex];
	               int y = BoardPanel.endPosY[PlayGame.playUser][Data.choiceMalIndex];
	               BoardPanel.selectBoard.setLocation(x,y);
	            }
	            
	            for(int i=0;i<19;i++){
	               PlayGame.switchOfBoardClik[i]  =false;
	            }
	            for(int i=0;i<2;i++){
	               for(int j = 0 ; j<1 ; j++){
	                  PlayGame.switchOfEndBoardClick[i][j]=false;
	               }
	            }
	            
	            if(s>=0)
	               PlayGame.switchOfBoardClik[s]=true;
	            else
	               PlayGame.switchOfEndBoardClick[PlayGame.playUser][Data.choiceMalIndex]=true;
	            if(l>=0)
	               PlayGame.switchOfBoardClik[l]=true;
	            else
	               PlayGame.switchOfEndBoardClick[PlayGame.playUser][Data.choiceMalIndex]=true;
	         }
	         else{
	            BoardPanel.selectBoard.setLocation(620, 320);
	            
	            for(int i=0;i<19;i++){
	               PlayGame.switchOfBoardClik[i]  =false;
	            }
	            for(int i=0;i<0;i++)
	            {
	               for(int j = 0 ; j<0 ; j++){
	                  PlayGame.switchOfEndBoardClick[i][j]=false;
	                  
	               }
	            }
	         }
	      }
	   }
	}