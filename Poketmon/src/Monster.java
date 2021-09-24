abstract public class Monster {
	String name;
	int hp;
	int hitPW;
	
	public abstract void Sound();
	public abstract void Attack();
	public abstract void Hit();
	public abstract void SetName(String k);
	public abstract void ShowName();

}
