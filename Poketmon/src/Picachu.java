 public class Picachu extends Monster
 {
	 public void Sound()
	 {
		 System.out.println("�߱�߱�");
	 }
	public void Attack()
	{
		System.out.println("���� �Ŀ�~" + this.hitPW);
	}
	public void Hit()
	{
		this.hp = this.hp-1;
		System.out.println("��! �¾Ҵ�" + this.hp);
	}
	public void SetName(String k)
	{
		this.name = k;
	}
	public void ShowName()
	{
		System.out.println("============================================");
		System.out.println("�� �̸���" + this.name);
	}
	public void setHP(int hp, int hPW)
	{
		this.hp = hp;
		this.hitPW = hPW;
	}
 }
 