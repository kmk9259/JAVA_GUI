import java.io.*;
import java.util.*;

public class Dotcombust 
{
	private GameHelper helper =new GameHelper();
	private ArrayList <DotCom> dotComsList = new ArrayList<DotCom> ();
	private int numOfGuess =0;
	
	private void setUpGame()
	{
		DotCom one = new DotCom();
		one.setName("Pets.com");
		DotCom two = new DotCom();
		two.setName("eToys.com");
		DotCom three = new DotCom();
		three.setName("Go2.com");
		dotComsList.add(one);
		dotComsList.add(two);
		dotComsList.add(three);
		
		for(DotCom dotComToSet : dotComsList)
		{
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);			
		}
		
	}
	private void startPlaying ()
	{
		while(!dotComsList.isEmpty())
		{
			String userGuess = helper.getUserInput("Enter a guess");
			checkUserGuess (userGuess);
		}
		finishGame();		
	}
}
