package everyone_dice;
public class Data 
{
	public static int reultOfDice[][] = new int[2][1];//�ֻ��� ��� ����
	public static int nowResultOfDice;  //���� �ֻ��� ��
	
	public static int choiceMalIndex;   //������ ��
	public static int choichResultIndex; //���� ���
	      
	public static void dataInit()
	{
		nowResultOfDice = 0;
		choiceMalIndex=0;
		choichResultIndex= -1;
		for(int i=0;i<1;i++)
		{
			reultOfDice[0][i] = 0;
			reultOfDice[1][i] = 0;
		}
	}

}