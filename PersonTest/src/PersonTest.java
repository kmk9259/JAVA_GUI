
public class PersonTest {
	public static void main(String [] args)
	{
		Person p;
		MiliteryPerson p2 = new MiliteryPerson();
		p= p2; //군인은 사람이다
		//p2=p; // 사람은 군인이다-->하위클래스로 대입은 안됌.
		
		p2.setName("정승도");
		p2.age = 35;
		p2.milNum = 120;
		p=p2;
		p.sayAge();
		p.sayMyself();
		
		/*
		Person p = new Person();
		p.setName("정승도");
		p.age = 25;
		p.sayAge();
		p.sayMyself();
		MiliteryPerson mp = new MiliteryPerson();
		mp.milNum = 120;
		mp.setName( "장세리");
		mp.age = 21;
		mp.sayAge();
		mp.sayMyself();
		mp.sayAge(10);
		*/
	}

}

