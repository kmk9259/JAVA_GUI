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
			System.out.print("��ȣ���� ����");
		}
	}
	
	public void hit(int a)
	{
		if(x==a)
		{
			if(guard>0)
			{
				guard=guard-1;
				System.out.println("�¾���. ���� ä����"+hp+"���� ��ȣ����"+guard);
			}
			else
			{
				hp=hp-1;
				System.out.println("�¾���. ���� ä����"+hp+"���� ��ȣ����"+guard);
			}
			
		}
		else
			System.out.println("�ȸ���");
	}
}