import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CalculatingMachineSystem
{
 JFrame frame;
 JTextField field; //결과창
 
 ///////연산을 위한 변수들.
 String printScrin = ""; //화면에 입력값을 출력하는 변수
 int totalResult = 0; //최종값을 누적이킬 변수
 String tempStirng = ""; //현재 사용자가 입력한 값을 입력받을 변수.
 int tempInteger; //사용자가 입력한 값을 정수값으로 가질 변수.
 int operate = 0;
 public static void main(String[] args)
 {
  CalculatingMachineSystem cal = new CalculatingMachineSystem();
  cal.go();
 }

 public void go()
 {
  frame = new JFrame("CalculatingMachineSystem");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   GridLayout g;
   GridLayout g1;
         
   g = new GridLayout(4,3);   
   g.setVgap(4);
   g.setHgap(6);
   
         g1 = new GridLayout(6,0);   
         g.setVgap(4);
   g.setHgap(6);
   
         JPanel panel1 = new JPanel();
         JPanel numPanel = new JPanel(); //숫자버튼을 배치할 패널
  //0~9까지 숫자버튼
  JButton num1 = new JButton("1");
  num1.addActionListener(new Num1());
  
  JButton num2 = new JButton("2");
  num2.addActionListener(new Num2());
  
  JButton num3 = new JButton("3");
  num3.addActionListener(new Num3());

  JButton num4 = new JButton("4");
  num4.addActionListener(new Num4());
  
  JButton num5 = new JButton("5");
  num5.addActionListener(new Num5());
  
  JButton num6 = new JButton("6");
  num6.addActionListener(new Num6());
  
  JButton num7 = new JButton("7");
  num7.addActionListener(new Num7());
  
  JButton num8 = new JButton("8");
  num8.addActionListener(new Num8());
  
  JButton num9 = new JButton("9");
  num9.addActionListener(new Num9());
  
  JButton num0 = new JButton("0");
  num0.addActionListener(new Num0());
  
  JButton empty = new JButton(" ");
  JButton empty1 = new JButton(" ");
  
  //+,-,*,/,= 연산버튼 & clear버튼
  JButton add = new JButton(" + ");
  add.addActionListener(new Add());
  
  JButton min = new JButton(" - ");
  min.addActionListener(new Min());
  
  JButton mul = new JButton(" * ");
  mul.addActionListener(new Mul());
  
  JButton div = new JButton(" / ");
  div.addActionListener(new Div());
  
  JButton equal = new JButton(" = ");
  equal.addActionListener(new Equals());
  
  JButton clear = new JButton("Clear");
  clear.addActionListener(new Clear());
  
  field = new JTextField(20);
  
  numPanel.setLayout(g);
  panel1.setLayout(g1);
  
  //패널에 추가된 버튼
  panel1.add(add);
  panel1.add(min);
  panel1.add(mul);
  panel1.add(div);
  panel1.add(equal);
  panel1.add(clear);
 
  numPanel.add(num7);
  numPanel.add(num8);
  numPanel.add(num9);
  numPanel.add(num4);
  numPanel.add(num5);
  numPanel.add(num6);
  numPanel.add(num1);
  numPanel.add(num2);
  numPanel.add(num3);
  numPanel.add(empty);
  numPanel.add(num0);
  numPanel.add(empty1);
  
  
  //프레임에 배치
  frame.getContentPane().add(BorderLayout.NORTH, field);
  frame.getContentPane().add(BorderLayout.EAST, panel1);
  frame.getContentPane().add(BorderLayout.CENTER, numPanel);
  
  frame.setSize(350,300);
  frame.setVisible(true);
 }
 
 // 숫자 입력을 위한 클래스 
 class Num0 implements ActionListener{
  public void actionPerformed(ActionEvent event)
  {
   tempStirng += "0"; 
   field.setText("");
   field.setText(tempStirng);
  }
 }
 
 class Num1 implements ActionListener{
  public void actionPerformed(ActionEvent event)
  {
   tempStirng += "1"; 
   field.setText("");
   field.setText(tempStirng);
  }
 }
 
 class Num2 implements ActionListener{
  public void actionPerformed(ActionEvent event)
  {
   tempStirng += "2"; 
   field.setText("");
   field.setText(tempStirng);
  }
 }
 
 class Num3 implements ActionListener{
  public void actionPerformed(ActionEvent event)
  {
   tempStirng += "3"; 
   field.setText("");
   field.setText(tempStirng);
  }
 }
 
 class Num4 implements ActionListener{
  public void actionPerformed(ActionEvent event)
  {
   tempStirng += "4"; 
   field.setText("");
   field.setText(tempStirng);
  }
 }
 
 class Num5 implements ActionListener{
  public void actionPerformed(ActionEvent event)
  {
   tempStirng += "5"; 
   field.setText("");
   field.setText(tempStirng);
  }
 }
 
 class Num6 implements ActionListener{
  public void actionPerformed(ActionEvent event)
  {
   tempStirng += "6"; 
   field.setText("");
   field.setText(tempStirng);
  }
 }
 
 class Num7 implements ActionListener{
  public void actionPerformed(ActionEvent event)
  {
   tempStirng += "7"; 
   field.setText("");
   field.setText(tempStirng);
  }
 }
 
 class Num8 implements ActionListener{
  public void actionPerformed(ActionEvent event)
  {
   tempStirng += "8"; 
   field.setText("");
   field.setText(tempStirng);
  }
 }
 
 class Num9 implements ActionListener{
  public void actionPerformed(ActionEvent event)
  {
   tempStirng += "9"; 
   field.setText("");
   field.setText(tempStirng);
  }
 }
 
 /////////////////////////////////////////////////////////////////
 
 class Add implements ActionListener{
  public void actionPerformed(ActionEvent event){
   if(totalResult==0){
    tempInteger = Integer.parseInt(tempStirng);
    totalResult = tempInteger;
    
    tempStirng = ""; 
   }
   else {
    tempInteger = Integer.parseInt(tempStirng);
    totalResult = totalResult + tempInteger;
    
    tempStirng = "";
   }
   operate = 1;
  }
 }
 
 class Min implements ActionListener{
  public void actionPerformed(ActionEvent event)
  {
   if(totalResult==0){
    tempInteger = Integer.parseInt(tempStirng);
    totalResult = tempInteger;
    
    tempStirng = ""; 
   }
   else {
    tempInteger = Integer.parseInt(tempStirng);
    totalResult = totalResult - tempInteger;
    tempStirng = ""; 
   }
   operate = 2;
  }
 }
 
 class Mul implements ActionListener{
  public void actionPerformed(ActionEvent event)
  {
   if(totalResult==0){
    tempInteger = Integer.parseInt(tempStirng);
    totalResult = tempInteger; 
    tempStirng = ""; 
 }
   else {
    tempInteger = Integer.parseInt(tempStirng);
    totalResult = totalResult * tempInteger;   
    tempStirng = "";    
   }
   operate = 3;
  }
 }
 
 class Div implements ActionListener{
  public void actionPerformed(ActionEvent event)
  {
   if(totalResult==0){
    tempInteger = Integer.parseInt(tempStirng);
    totalResult = tempInteger;
    tempStirng = ""; 
   }
   else {
    tempInteger = Integer.parseInt(tempStirng);
    totalResult = totalResult / tempInteger;
    
    tempStirng = "";    
   }
   operate = 4;
  }
 }
 
 class Equals implements ActionListener{
  public void actionPerformed(ActionEvent event)
  {
   tempInteger = Integer.parseInt(tempStirng);
   
   switch(operate){
   case 1: totalResult = totalResult + tempInteger; break;
   case 2: totalResult = totalResult - tempInteger; break;
   case 3: totalResult = totalResult * tempInteger; break;
   case 4: totalResult = totalResult / tempInteger; break;
   }
    
   printScrin = String.valueOf(totalResult);
   field.setText(printScrin);
   totalResult = 0;
  }
 }
 
 class Clear implements ActionListener{
  public void actionPerformed(ActionEvent event)
  {
   printScrin = "";
   field.setText(printScrin);
   field.setText("");
   field.requestFocus();   
   
   tempStirng = ""; 
   printScrin = "";
  }
 }
}
