
public class Ship 
{
	int x; //비행기의 1차원상의 위치
	
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
