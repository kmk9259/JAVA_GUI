
public class MyPoketmonList 
{
	private Monster [] monsters = new Monster[5]; // 
	private int nextIndex = 0;
	
	public void add(Monster a)
	{
		if(nextIndex < monsters.length)
		{
			monsters[nextIndex] = a;
			System.out.println(a.name + "��" + nextIndex + "�� �ִ�." );
			nextIndex++;
		}
	}
	public void show()
	{
		System.out.println("======================================");
		System.out.println("���ϸ� ����Ʈ��");
		for (int b=0; b<nextIndex; b++)
		{
			System.out.println(monsters[b].name);
		}
		System.out.println("===============��===============");
	}
}
