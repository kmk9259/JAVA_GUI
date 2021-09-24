
public class MyPoketmonList 
{
	private Monster [] monsters = new Monster[5]; // 
	private int nextIndex = 0;
	
	public void add(Monster a)
	{
		if(nextIndex < monsters.length)
		{
			monsters[nextIndex] = a;
			System.out.println(a.name + "는" + nextIndex + "에 있다." );
			nextIndex++;
		}
	}
	public void show()
	{
		System.out.println("======================================");
		System.out.println("포켓몬 리스트는");
		for (int b=0; b<nextIndex; b++)
		{
			System.out.println(monsters[b].name);
		}
		System.out.println("===============끝===============");
	}
}
