
public class GameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Picachu p1 = new Picachu();
		p1.setHP(10,10);
		p1.Sound();
		p1.Hit();
		p1.SetName("��ī��");
		p1.ShowName();
		
		liechoo l1 = new liechoo();
		l1.setHP(10,10);
		l1.Sound();
		l1.Hit();
		l1.SetName("������");
		l1.ShowName();
		
		MyPoketmonList list =  new MyPoketmonList();
		list.add(p1);
		list.add(l1);
		list.show();
	}

}
