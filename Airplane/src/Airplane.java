class Airplane{
	int x,y;
	int health_power;
	
	void move_left()
	{
		x=x-1;
		System.out.println("���� ��ġ��" + x + "�Դϴ�.");
	}
	void move_right()
	{
		x=x+1;
		System.out.println("���� ��ġ��" + x + "�Դϴ�.");
	}
	void move_up()
	{
		y=y+1;
		System.out.println("���� ��ġ��" + y + "�Դϴ�.");
	}
	void move_down()
	{
		y=y-1;
		System.out.println("���� ��ġ��" + y + "�Դϴ�.");
	}
	void daegak_1()
	{
		x=x+1;
		y=y+1;
		System.out.println("���� ��ġ��" + x + y + "�Դϴ�.");
	}
	void daegak_2()
	{
		x=x+1;
		y=y-1;
		System.out.println("���� ��ġ��" + x + y + "�Դϴ�.");
	}
	void daegak_3()
	{
		x=x-1;
		y=y+1;
		System.out.println("���� ��ġ��" + x + y + "�Դϴ�.");
	}
	void daegak_4()
	{
		x=x-1;
		y=y-1;
		System.out.println("���� ��ġ��" + x + y + "�Դϴ�.");
	}
	
	void fight()
	{
		health_power=health_power-1;
		System.out.println("���� ü����" + health_power+ "�Դϴ�.");
	}
	void set_up(int a ,int b, int c)
	{
		x=a;
		y=b;
		health_power= c;
		
		//System.out.println(x+y+health_power);
	}
	void position()
	{
		System.out.println("���� ��ġ��" + x + "," + y + "�Դϴ�.");
	}
	
	
}

