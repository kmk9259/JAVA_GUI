package ShipGame2_0412;

public class SpecialShip extends Ship
{
	int guard;
	public void protect()
	{
		int a = (int)Math.random()*15;
		if(a==1)
		{
			guard = guard+3;
			System.out.print("보호막을 얻음");
		}
	}
	
	public void hit(int a)
	{
		if(x==a)
		{
			if(guard>0)
			{
				guard=guard-1;
				System.out.println("맞았음. 현재 채력은"+hp+"현재 보호막은"+guard);
			}
			else
			{
				hp=hp-1;
				System.out.println("맞았음. 현재 채력은"+hp+"현재 보호막은"+guard);
			}
			
		}
		else
			System.out.println("안맞음");
	}
}