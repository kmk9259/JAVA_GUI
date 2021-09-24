package ShipGame2_0412;
public class Ship {
	public int x;
	public int hp;
	
	public void setPos(int a)
	{
		x=a;
	}
	public void setHP(int a)
	{
		hp=a;
	}
	public void seePos()
	{
		System.out.println("현재 위치는"+x);
	}
	public int seeHP()
	{
		return hp;
	}
	public boolean checkHP()
	{
		if (hp==0)
			return false;
		else
			return true;
	}
	public boolean checkHit(int a)
	{
		if(a==x)
			return true;
		else 
			return false;
	}
	public void hit(int a)
	{
		if(x==a)
		{
			hp=hp-1;
			System.out.println("맞았음. 현재 체력은"+hp);
		}
		else
			System.out.println("안맞았음");
	}

}
