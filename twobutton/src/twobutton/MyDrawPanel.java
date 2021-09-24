package twobutton;

import javax.swing.*;
import java.awt.*;
//import java.awt.BorderLayout;

public class MyDrawPanel extends JPanel //JPanel->그림그릴수있는 판넬
{
	public void paintComponent(Graphics g)//그래픽구현
	{
		Graphics2D g2d = (Graphics2D) g;
		Graphics2D g1d = (Graphics2D) g;
		
		int x_int = (int) (Math.random()*100);
		int y_int = (int) (Math.random()*200+100);
		int x = (int) (Math.random()*300+200);
		int y = (int) (Math.random()*400+300);
		int red = (int) (Math.random()*256);
		int green = (int) (Math.random()*256);
		int blue= (int) (Math.random()*256);
		
		Color sc = new Color (red, green, blue);
		red = (int) (Math.random()*256);
		green = (int) (Math.random()*256);
		blue= (int) (Math.random()*256);
		Color ec = new Color (red, green, blue);
		
		GradientPaint gr = new GradientPaint(70,70,sc,150,150,ec);
		g2d.setPaint(ec);
		g2d.fillOval(x, y, 100, 100);
		GradientPaint gg = new GradientPaint(70,70,sc,150,150,ec);
		g1d.setPaint(sc);
		g1d.fillOval(x_int, y_int , 80, 80);
	}
	

}