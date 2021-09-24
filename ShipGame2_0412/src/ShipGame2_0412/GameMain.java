package ShipGame2_0412;
import java.util.*;
public class GameMain 
{
	int MAXPOS=10;
	int MAX_HP=3;
	int enemyPosMAX=15;
	int count=0;
	
	public void gameStart()
	{
		
		SpecialShip fighter1 = new SpecialShip(); //ship�̶�� ��ü�� fighter1�� ����.
		
		fighter1.setPos((int)(Math.random()*MAXPOS));
		fighter1.setHP(MAX_HP);
		int enemyPos=(int)(Math.random()*enemyPosMAX);
		
		Scanner s = new Scanner(System.in);
		
		while(fighter1.checkHP())
		{
			fighter1.protect();
			System.out.println("������ǥ�� �Է��Ͻÿ�: ");
			int tmp_pos = s.nextInt();
			if(tmp_pos == enemyPos)
			{
				System.out.println("���� �¾Ҵ�!!");
				break;
			}
			System.out.println("���� ������ �����ߴ�!!");
			int tmp_bullet = (int)Math.random()*MAXPOS;
			if(fighter1.checkHit(tmp_bullet))
			{
				fighter1.hit(tmp_bullet);
			}
			else
				fighter1.hit(tmp_bullet);
		}
	}
	

	public static void main(String[] args) 
	{
		GameMain Game1 = new GameMain();
		Game1.gameStart();
	}

}
