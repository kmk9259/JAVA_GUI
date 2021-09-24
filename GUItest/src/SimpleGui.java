import javax.swing.*; //��ư ����
//import java.awt.BorderLayout;
import java.awt.event.*; //�̺�Ʈ
import java.awt.*;

public class SimpleGui implements ActionListener 
{

	JButton button;
	public static void main (String [] args)
	{
		SimpleGui gui = new SimpleGui();
		gui.go();
	}	
	public void go()
	{
		JFrame frame = new JFrame(); //â�߱�
		button = new JButton("Click me");
		button.addActionListener(this);
		
		MyDrawPanel mp = new MyDrawPanel();
		frame.getContentPane().add(BorderLayout.CENTER, mp);		
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.setSize(400, 400);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent event)
	{
		button.setText("Cliked button");
	}
	
}
