public class AlphaGo extends Computer implements Human
{
	int condition, characteristic;
	
	public void input (int a, int b)
	{
		this.in1=a ;
		this.in2 = b ;
	}
	public void calc (char a) //��Ģ���� ,
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
	public void output()//������
	{
		System.out.println("��� ����"+this.out+"�Դϴ�.");
	}
	public void condition()
	{
		condition = (int)(Math.random()*2);
		if(condition ==0)
		{
			System.out.println("����� ���� �˷��ٰ�");
			output();
		}
			
	}
	public void characteristic()
	{
		characteristic = (int)(Math.random()*2);
		if(characteristic ==0)
		{
			System.out.println("������ ���� �˷��ٰ�");
			output();
		}
	}
}
