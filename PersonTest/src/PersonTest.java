
public class PersonTest {
	public static void main(String [] args)
	{
		Person p;
		MiliteryPerson p2 = new MiliteryPerson();
		p= p2; //������ ����̴�
		//p2=p; // ����� �����̴�-->����Ŭ������ ������ �ȉ�.
		
		p2.setName("���µ�");
		p2.age = 35;
		p2.milNum = 120;
		p=p2;
		p.sayAge();
		p.sayMyself();
		
		/*
		Person p = new Person();
		p.setName("���µ�");
		p.age = 25;
		p.sayAge();
		p.sayMyself();
		MiliteryPerson mp = new MiliteryPerson();
		mp.milNum = 120;
		mp.setName( "�弼��");
		mp.age = 21;
		mp.sayAge();
		mp.sayMyself();
		mp.sayAge(10);
		*/
	}

}

