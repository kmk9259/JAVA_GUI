package aaaa;

public class SimpleDotCom {
	int[] locationCells;
	int numOFHits=0;
	
	public void setLocationCells(int[] locs)
	{
		locationCells = locs;
	}
	public String checkYourself(String stringGuess){
		
		int guess = Integer.parseInt(stringGuess);//int�� ��ȯ
		String result = "miss" ;

		for (int i=0; i< locationCells.length; i++) 
		{
		      if (guess == locationCells[i]) 
		      {
		         result = "hit";
		         numOFHits++;//���ᰳ��
		         break;
		      }
		}
		 for(int i=0; i<locationCells.length; i++)
		      {
			 	if(result =="miss")
			 	{
		    	  System.out.println("�Ÿ���"+Math.abs(guess-locationCells[i])+"�Դϴ�.");
		    	  
			 	}
		      }

		if (numOFHits == locationCells.length) 
		{
		      result = "kill";
		}

		   System.out.println(result);
		   return result;
	}

}
