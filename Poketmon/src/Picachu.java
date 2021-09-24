 public class Picachu extends Monster
 {
	 public void Sound()
	 {
		 System.out.println("삐까삐까");
	 }
	public void Attack()
	{
		System.out.println("공격 파워~" + this.hitPW);
	}
	public void Hit()
	{
		this.hp = this.hp-1;
		System.out.println("윽! 맞았다" + this.hp);
	}
	public void SetName(String k)
	{
		this.name = k;
	}
	public void ShowName()
	{
		System.out.println("============================================");
		System.out.println("내 이름은" + this.name);
	}
	public void setHP(int hp, int hPW)
	{
		this.hp = hp;
		this.hitPW = hPW;
	}
 }
 