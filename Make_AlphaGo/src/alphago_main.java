import java.util.Scanner;

public class alphago_main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		AlphaGo al = new AlphaGo();
		int a,b;
		char c;
		
		System.out.println("����1�� �Է����ּ���");
		a=sc.nextInt();
		System.out.println("����2�� �Է����ּ���");
		b=sc.nextInt();
		System.out.println("��Ģ���� ��ȣ�� �Է��� �ּ���");
		c=sc.next().charAt(0);
		
		al.input(a, b);
		al.calc(c);
		al.condition();
		al.characteristic();
		al.output();
		
	
	}

}
