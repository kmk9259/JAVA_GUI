package everyone_dice;

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class rule_tmp 
{
	
	JFrame fr; 
	public static void main(String []args)
	{
		rule_tmp rule = new rule_tmp();
		rule.go();
	}
	
	public void go()
	{
		fr = new JFrame("���� ����");
		JPanel panel = new JPanel();
		JTextArea text = new JTextArea(20,40);
		JScrollPane qScroller = new JScrollPane(text);
		
		text.setLineWrap(true);
	    qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	    qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	    panel.add(qScroller);
	    fr.getContentPane().add(BorderLayout.CENTER,panel);
	    text.setText("-�̰��� �ܼ��� �ֻ��� �����Դϴ�.\n-<�ֻ��� ������> ��ư�� �����ϴ�.\n-�ؽ�Ʈ �ʵ忡�� �ֻ��� ���� Ȯ�� �� �� ���� <�ֻ��� ����>��ư�� �����ϴ�.\n-�����ǿ� ���v���� ���� ��ǥ�� �����ϴ�. \n-��Ⱑ �����մϴ�.\n-1P�� 2P�� �����ư��鼭 �÷��� �� �� ���� �ѹ��� ���� ���� �¸��մϴ�.\n<Game Over>");
	    
	    fr.setSize(600,600);
	    fr.setVisible(true);
	}
	
}
