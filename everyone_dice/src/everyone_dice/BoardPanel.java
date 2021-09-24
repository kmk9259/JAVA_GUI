package everyone_dice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.net.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class BoardPanel extends JPanel implements MouseListener
{
   public static int[] boardPosX = new int[20];
   public static int[] boardPosY = new int[20];
   public static int[][] startPosX = new int[2][1];
   public static int[][] startPosY = new int[2][1];
   public static int[][] endPosX = new int[2][1];
   public static int[][] endPosY = new int[2][1];
   public static final int WIDTH = 50;
   public static final int HEIGHT = 50;
   

   private static final long serialVersionUID = 1L;
   private Img boardLabel;
   private Img startBoard;
   private Img endBoard;

   public static JPanel instence;
   public static JButton[] diceResultButton = new JButton[1];
   public static Img selectBoard;
   public static Mal[][] mal = new Mal[2][1];
   public static JTextPane textPane;
   public static JButton throwBtn;
   public static JButton chat_button;
   public static JButton rule;
   JFrame frame ;
   int dice;

   public BoardPanel() 
   {
      instence = this;
      addMouseListener(this);
      initPosition();
      initImg();
      button();
   }

   private void initPosition() 
   {
      setPox(0, 490, 500);
      setPox(1, 490, 400);
      setPox(2, 490, 320);
      setPox(3, 490, 220);
      setPox(4, 490, 140);
      
      setPox(5, 490, 35);
      setPox(6, 400, 35);
      setPox(7, 320, 35);
      setPox(8, 220, 35);
      setPox(9, 120, 35);
      setPox(10, 40, 35);
      setPox(11, 40, 140);
      setPox(12, 40, 220);
      setPox(13, 40, 320);
      setPox(14, 40, 400);
      
      setPox(15, 40, 500);
      setPox(16, 120, 500);
      setPox(17, 220, 500);
      setPox(18, 320, 500);
      setPox(19, 420, 500);
     
   }

   private void setPox(int index, int x, int y) 
   {
      boardPosX[index] = x;
      boardPosY[index] = y;
   }

   private void initImg() 
   {
      setBounds(0, 0, 780, 690);
      setLayout(null);
      
      for (int i = 0; i < 2; i++) 
      {
         for (int j = 0; j < 1; j++) 
         {
            startPosX[i][j] = 670 + 50 * j;
            startPosY[i][j] = 20 + 50 * i;
            endPosX[i][j] = 670 + 50 * j;
            endPosY[i][j] = 160 + 50 * i;

            if (i == 0)
               mal[i][j] = new Mal("img_appech1.png", startPosX[i][j],
                     startPosY[i][j], 50, 50);
            else if (i == 1)
               mal[i][j] = new Mal("img_lionn.png", startPosX[i][j],
                     startPosY[i][j], 50, 50);

            mal[i][j].drawImg(this);
         }
      }
      
         selectBoard = new Img("img_select.png", 620 + 70 * 1, 320, 50,50);
         selectBoard.drawImg(this);
      

      diceResultButton[0] = new JButton("");
      diceResultButton[0].setBounds(630, 420, 120, 50);
      add(diceResultButton[0]);
      diceResultButton[0].addActionListener(new ActionListener() 
      {
        
         public void actionPerformed(ActionEvent e) {
            Data.choichResultIndex = 0;
         }
      });

      startBoard = new Img("img_start.png", 590, 0, 190, 140);
      startBoard.drawImg(this);
      endBoard = new Img("img_end.png", 590, 140, 190, 140);
      endBoard.drawImg(this);
      boardLabel = new Img("img_board1.png", 0, 0, 590, 590);
      boardLabel.drawImg(this);

      throwBtn = new JButton("주사위 던지기");
      throwBtn.addActionListener(new ActionListener() 
      {
         public void actionPerformed(ActionEvent e) 
         {
            diceThrow_reset();
            Data.nowResultOfDice =diceThrow();
            

            PlayGame.switchOfThrowBtn = true;
         }
      });
      throwBtn.setBounds(590, 590, 190, 100);
      add(throwBtn);

      
      textPane = new JTextPane();
      textPane.setFont(new Font("맑은고딕", Font.PLAIN, 20));
      textPane.setForeground(Color.BLACK);
      textPane.setBackground(Color.ORANGE );
      textPane.setBounds(0, 590, 590, 100);
      add(textPane);

   }

   
   public int diceThrow() 
   {
	  dice=(int)(Math.random()*6+1);
	 
      JTextField dice_field = new JTextField(20);
      dice_field.setText(dice_field.getText());
      dice_field.setText("주사위 값은 " +dice);
       
      textPane.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
      dice_field.setBounds(590, 500, 190, 100);
      add(dice_field);
      
      
      this.repaint();
      return dice;
   }
   
   public void diceThrow_reset() 
   {
	      JTextField dice_field2 = new JTextField();
	      dice_field2.setText(dice_field2.getText());
	      dice_field2.setText("전진중...!!!!!!!!!!!!!!!!!!!!!!");
	      
	      textPane.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
	      dice_field2.setBounds(590, 500, 190, 100);
	      add(dice_field2);
	      this.repaint();

   }
   public void button()
   {
	   chat_button = new JButton("채팅하기");
	   chat_button.addActionListener(new ActionListener() 
	      {
	         public void actionPerformed(ActionEvent e) 
	         {
	        	 SimpleChatClient si = new SimpleChatClient ();
	        	 si.go();
	         }
	      });
	   chat_button.setBounds(320, 400, 120, 50);
	   add(chat_button);
	   
	  rule = new JButton("게임 설명");
	  rule.addActionListener(new ActionListener() 
      {
         public void actionPerformed(ActionEvent e) 
         {
        	rule_tmp ru= new rule_tmp();
        	ru.go();
         }
      });
	  rule.setBounds(140, 400, 120, 50);
	  add(rule);
   
   }
   

   public void mouseClicked(MouseEvent e) 
   {
      
   }

   public void mouseEntered(MouseEvent e) 
   {
   
   }
   
   public void mouseExited(MouseEvent e) 
   {
      
   }

   public void mousePressed(MouseEvent e) 
   {

   }

   public void mouseReleased(MouseEvent e) 
   {
      if (PlayGame.switchOfMoveMalTurn) 
      {
         for (int i = 0; i < 19; i++) 
         {
            if (PlayGame.switchOfBoardClik[i]) 
            {
               if (e.getX() >= boardPosX[i]&& e.getX() < boardPosX[i] + WIDTH) 
               {
                  if (e.getY() >= boardPosY[i]&& e.getY() < boardPosY[i] + HEIGHT) 
                  {
                     int startX = mal[PlayGame.playUser][Data.choiceMalIndex].getX();
                     int startY = mal[PlayGame.playUser][Data.choiceMalIndex].getY();
                     int endX = boardPosX[i];
                     int endY = boardPosY[i];

                     for (int malIndex = 0; malIndex < 1; malIndex++) 
                     {
                        if (mal[PlayGame.playUser][malIndex].getX() == startX) 
                        {
                           if (mal[PlayGame.playUser][malIndex].getY() == startY) 
                           {
                              mal[PlayGame.playUser][malIndex]
                                    .setLocation(endX, endY, PlayGame.playUser);
                           }
                        }
                     }

               
                     int playIndex = 0;
                     if (PlayGame.playUser == PlayGame.USER1)
                        playIndex = PlayGame.USER2;
                     else
                        playIndex = PlayGame.USER1;

                     for (int malIndex = 0; malIndex < 1; malIndex++) 
                     {
                        if (mal[playIndex][malIndex].getX() == endX) 
                        {
                           if (mal[playIndex][malIndex].getY() == endY) 
                           {
                         
                              mal[playIndex][malIndex]
                                    .setLocation(
                                          BoardPanel.startPosX[playIndex][malIndex],
                                          BoardPanel.startPosY[playIndex][malIndex],playIndex);
                           
                           }
                        }
                     }

                     Data.reultOfDice[PlayGame.playUser][Data.choichResultIndex] = 0;
                     PlayGame.switchOfMoveClick = true;
                     break;
                  }
               }
            }
         }

         for (int i = 0; i < 2; i++) 
         {
            if (PlayGame.switchOfEndBoardClick[PlayGame.playUser][i]) 
            {
               if (e.getX() >= endPosX[PlayGame.playUser][i]
                     && e.getX() < endPosX[PlayGame.playUser][i] + WIDTH) 
               {
                  if (e.getY() >= endPosY[PlayGame.playUser][i]
                        && e.getY() < endPosY[PlayGame.playUser][i]
                              + HEIGHT) {

                     int startX = mal[PlayGame.playUser][Data.choiceMalIndex]
                           .getX();
                     int startY = mal[PlayGame.playUser][Data.choiceMalIndex]
                           .getY();

                     for (int malIndex = 0; malIndex < 1; malIndex++) {
                        if (mal[PlayGame.playUser][malIndex].getX() == startX) {
                           if (mal[PlayGame.playUser][malIndex].getY() == startY) {
                              mal[PlayGame.playUser][malIndex]
                                    .setLocation(
                                          BoardPanel.endPosX[PlayGame.playUser][malIndex],
                                          BoardPanel.endPosY[PlayGame.playUser][malIndex],PlayGame.playUser);
                           }
                        }
                     }
                     
                     Data.reultOfDice[PlayGame.playUser][Data.choichResultIndex] = 0;
                     PlayGame.switchOfMoveClick = true;
                  }
               }
            }
         }

         for (int i = 0; i < 2; i++) 
         {
            if (mal[PlayGame.playUser][i].isClick(e.getX(), e.getY())) 
            {
               Data.choiceMalIndex = 0;
             
               break;
            }
           
         }
      }
      Data.choichResultIndex = -1;

   }

}