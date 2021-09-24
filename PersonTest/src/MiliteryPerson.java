public class MiliteryPerson extends Person
{
	public int milNum;
	public void sayAge(int a)
	{
		System.out.println("나이: " + a);
	}
	public void sayMyself()
	{
		System.out.println(name+ age + milNum + "훈련병");
	}
}