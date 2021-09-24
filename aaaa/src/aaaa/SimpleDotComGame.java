package aaaa;

public class SimpleDotComGame {
	public static void main(String[] args) {
		   int numOfGuesses = 0;
		   GameHelper helper = new GameHelper();

		   SimpleDotCom theDotCom = new SimpleDotCom();
		   int randomNum = (int) (Math.random() * 10); //0~9
		   int randomNum2 = (int) (Math.random()*8)+10; //10~20
		   
		   int[] locations = {randomNum, randomNum+1, randomNum+2, randomNum2,randomNum2+1,randomNum2+2};
		   
		   theDotCom.setLocationCells(locations);
		   
		   boolean isAlive = true;

		   while (isAlive == true) {
		      String guess = helper.getUserInput("enter a number");
		      String result = theDotCom.checkYourself(guess);
		      numOfGuesses++;
		      if (result.equals("kill")) {
		         isAlive = false;
		         System.out.println(numOfGuesses + " guesses");
		      } // if 문 끝
		   } // while 문 끝
		}  // main 끝
}
