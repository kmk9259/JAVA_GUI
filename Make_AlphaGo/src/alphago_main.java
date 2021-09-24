import java.util.Scanner;

public class alphago_main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		AlphaGo al = new AlphaGo();
		int a,b;
		char c;
		
		System.out.println("숫자1를 입력해주세요");
		a=sc.nextInt();
		System.out.println("숫자2를 입력해주세요");
		b=sc.nextInt();
		System.out.println("사칙연산 기호를 입력해 주세요");
		c=sc.next().charAt(0);
		
		al.input(a, b);
		al.calc(c);
		al.condition();
		al.characteristic();
		al.output();
		
	
	}

}
