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
		fr = new JFrame("게임 설명");
		JPanel panel = new JPanel();
		JTextArea text = new JTextArea(20,40);
		JScrollPane qScroller = new JScrollPane(text);
		
		text.setLineWrap(true);
	    qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	    qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	    panel.add(qScroller);
	    fr.getContentPane().add(BorderLayout.CENTER,panel);
	    text.setText("-이것은 단순한 주사위 게임입니다.\n-<주사위 던지기> 버튼을 누릅니다.\n-텍스트 필드에서 주사위 값을 확인 한 후 그위 <주사위 숫자>버튼을 누릅니다.\n-보드판에 나탖나는 빨간 지표를 누릅니다. \n-잡기가 가능합니다.\n-1P와 2P가 번갈아가면서 플레이 한 후 먼저 한바퀴 도는 말이 승리합니다.\n<Game Over>");
	    
	    fr.setSize(600,600);
	    fr.setVisible(true);
	}
	
}
