
public class Person
{
	protected  String name;
	public int age;
	public void setName(String N)
	{
		name = N;
	}
	public void sayAge()
	{
		System.out.println(age);
	}
	public void sayMyself()
	{
		System.out.println("나이: " + age +" "+"이름: " + name );
	}
}

