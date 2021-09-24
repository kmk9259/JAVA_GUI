package everyone_dice;
public class Data 
{
	public static int reultOfDice[][] = new int[2][1];//주사위 결과 저장
	public static int nowResultOfDice;  //현재 주사위 값
	
	public static int choiceMalIndex;   //선택한 말
	public static int choichResultIndex; //선택 결과
	      
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