import javax.swing.*;
import java.awt.*;
//import java.awt.BorderLayout;

public class MyDrawPanel extends JPanel //JPanel->그림그릴수있는 판넬
{
	public void paintComponent(Graphics g)//그래픽구현
	{
		Graphics2D g2d = (Graphics2D) g;
		int red = (int) (Math.random()*256);
		int green = (int) (Math.random()*256);
		int blue= (int) (Math.random()*256);
		
		Color sc = new Color (red, green, blue);
		red = (int) (Math.random()*256);
		green = (int) (Math.random()*256);
		blue= (int) (Math.random()*256);
		Color ec = new Color (red, green, blue);
		
		GradientPaint gr = new GradientPaint(70,70,sc,150,150,ec);
		g2d.setPaint(gr);
		g2d.fillOval(70, 70, 200, 200);
	}
	

}
