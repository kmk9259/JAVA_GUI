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
		
		SpecialShip fighter1 = new SpecialShip(); //ship이라는 객체를 fighter1에 만듦.
		
		fighter1.setPos((int)(Math.random()*MAXPOS));
		fighter1.setHP(MAX_HP);
		int enemyPos=(int)(Math.random()*enemyPosMAX);
		
		Scanner s = new Scanner(System.in);
		
		while(fighter1.checkHP())
		{
			fighter1.protect();
			System.out.println("공격좌표를 입력하시오: ");
			int tmp_pos = s.nextInt();
			if(tmp_pos == enemyPos)
			{
				System.out.println("적이 맞았다!!");
				break;
			}
			System.out.println("적이 공격을 시작했다!!");
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
