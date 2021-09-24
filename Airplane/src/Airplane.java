class Airplane{
	int x,y;
	int health_power;
	
	void move_left()
	{
		x=x-1;
		System.out.println("현재 위치는" + x + "입니다.");
	}
	void move_right()
	{
		x=x+1;
		System.out.println("현재 위치는" + x + "입니다.");
	}
	void move_up()
	{
		y=y+1;
		System.out.println("현재 위치는" + y + "입니다.");
	}
	void move_down()
	{
		y=y-1;
		System.out.println("현재 위치는" + y + "입니다.");
	}
	void daegak_1()
	{
		x=x+1;
		y=y+1;
		System.out.println("현재 위치는" + x + y + "입니다.");
	}
	void daegak_2()
	{
		x=x+1;
		y=y-1;
		System.out.println("현재 위치는" + x + y + "입니다.");
	}
	void daegak_3()
	{
		x=x-1;
		y=y+1;
		System.out.println("현재 위치는" + x + y + "입니다.");
	}
	void daegak_4()
	{
		x=x-1;
		y=y-1;
		System.out.println("현재 위치는" + x + y + "입니다.");
	}
	
	void fight()
	{
		health_power=health_power-1;
		System.out.println("현재 체력은" + health_power+ "입니다.");
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
		System.out.println("현재 위치는" + x + "," + y + "입니다.");
	}
	
	
}

