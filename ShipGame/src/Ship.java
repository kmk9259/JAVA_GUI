
public class Ship 
{
	int x; //������� 1�������� ��ġ
	
	void setup(int a)
	{
		x=a;
	}
	int see()
	{
		return x;
	}
	int confirm(int a)
	{
		if(a==x)
			return 1;
		else
			return 0;
	}
}
