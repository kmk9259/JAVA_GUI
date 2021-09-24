public class AlphaGo extends Computer implements Human
{
	int condition, characteristic;
	
	public void input (int a, int b)
	{
		this.in1=a ;
		this.in2 = b ;
	}
	public void calc (char a) //사칙연산 ,
	{
		if(a=='+')
			this.out = this.in1+this.in2;
		else if(a=='-')
			this.out = this.in1-this.in2;
		else if(a=='*')
			this.out = this.in1*this.in2;
		else
			this.out = this.in1/this.in2;
		
	}
	public void output()//결과출력
	{
		System.out.println("결과 값은"+this.out+"입니다.");
	}
	public void condition()
	{
		condition = (int)(Math.random()*2);
		if(condition ==0)
		{
			System.out.println("기분이 좋아 알려줄게");
			output();
		}
			
	}
	public void characteristic()
	{
		characteristic = (int)(Math.random()*2);
		if(characteristic ==0)
		{
			System.out.println("성격이 좋아 알려줄게");
			output();
		}
	}
}
