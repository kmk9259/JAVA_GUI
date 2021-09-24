package aaaa;

public class SimpleDotCom {
	int[] locationCells;
	int numOFHits=0;
	
	public void setLocationCells(int[] locs)
	{
		locationCells = locs;
	}
	public String checkYourself(String stringGuess){
		
		int guess = Integer.parseInt(stringGuess);//int로 변환
		String result = "miss" ;

		for (int i=0; i< locationCells.length; i++) 
		{
		      if (guess == locationCells[i]) 
		      {
		         result = "hit";
		         numOFHits++;//맞춘개수
		         break;
		      }
		}
		 for(int i=0; i<locationCells.length; i++)
		      {
			 	if(result =="miss")
			 	{
		    	  System.out.println("거리는"+Math.abs(guess-locationCells[i])+"입니다.");
		    	  
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
