import java.util.*;
import java.io.*;
public class ShipMain 
{
	private ArrayList<Ship> ShipList = new ArrayList <Ship>();
	private int mapSize = 10;
	
	private void setGame(int NumShip)
	{
		int temp[]= new int[mapSize];
		for(int i=0; i<mapSize; i++)
		{
			temp[i] = (int)(Math.random()*mapSize);
			
			for(int j=i-1; j>=0; j--)
			{
				if(temp[i]==temp[j])
				{
					i--;
					break;
				}
			}
			ShipList.add(temp[i]);
		}
		
		/*
		for (int a=0; a<NumShip; a++)
		{
			Ship tmp = new Ship();
			tmp.setup((int)(Math.random()*mapSize));
			ShipList.add(tmp);
		}*/
	}
			
	
	private void checkList(int a)
	{
		int result=0;
		for(Ship shipTest : ShipList)
		{
			result = shipTest.confirm(a);
			if(result ==1)
				System.out.println("맞음");
			else
				System.out.println("틀림");
		}
	}
	
	private void seeList()
	{
		for(Ship shipTest : ShipList)
		{
			System.out.println(shipTest.see());
		}
	}
	
	public static void main(String[] args) 
	{
		ShipMain p1=new ShipMain();
		p1.setGame(5);
		p1.seeList();
		p1.checkList(1);

	}

}
