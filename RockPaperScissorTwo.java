import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorTwo {

	public static void main (String[] args){
		//declare an array for 5 players
		String playerNames[] = new String[4];// to store  player names
		//int scores[] = new int[15];
 		String compMove = "";
		String playerMove = "";
		String playerName;
		int compScore = 0;
		int playerScore =0;
		int scores[] = new int[5];
		int tries = 0;
		int playerNumber = 5;	
		Random Rand = new Random(); //for random numbers
		Scanner input = new Scanner(System.in);
		//int counter = 0;
		
		//ask for user moves
		try{
	    for (int counter = 0; counter < 6; counter++){
			System.out.print("Enter your name "+(counter) + ": ");
			playerNames[counter] = input.next(); //to store the names of players
			System.out.println("Hello " +  playerNames[counter]);
		//counter++;
		System.out.println("Let's play rock, paper, scissors ");
		
		for (int i =0; i <3 ;i++){
			System.out.print("Enter 1 for rock ,  2 for paper , 3 for  scissors or press exit to quit the game: ");
			playerMove = input.next();
			if(playerMove.equals("exit")){
			   System.out.println("Thank you for your time ");
				System.exit(0);
		}
		if (!playerMove.equals("rock") && !playerMove.equals ("paper") && !playerMove.equals("scissor")){
			System.out.println("invalid input please try again");
		}																																																																																																																																																														
		else {
		//generate the random move
			int rand = (int)(Math.random() * 3);// to give us integer instead of double value
		
		if (rand ==0){
			compMove = "rock";	
		}else if (rand == 1){
			compMove = "paper";
		}else {
			compMove = "scissors";
			
		}
			System.out.println("computer move:  " + compMove);
		}
			System.out.println("tries left: " + tries);
		               																																																																																																																																																																																																																																																																																																																																																																									
			tries++;	
		//check if the player wants to exit the game																																																																																																																																																																																																																																																																	a
		
		 if (playerMove.equals(compMove)){
			System.out.println("you tied");
		}else if ((playerMove.equals("rock") && compMove.equals("scissors")) ||
					(playerMove.equals("scissors") && compMove.equals("paper"))||
					(playerMove.equals("paper")&& compMove.equals("rock"))){
					System.out.println("you won"); 
					playerScore+=10;
					System.out.println("your score: " + playerScore +  " points ");
					  
					}
		else {
					System.out.println("you lost");
					compScore+=10;
					System.out.println("computer score: " + (compScore));
					
					
					}
					if (tries == 3){
						tries = 0;
						playerName = playerNames[i];
						playerScore = scores[i];
						
						
					}
		 
		
		}
	}
		}
		catch(ArrayIndexOutOfBoundsException e){{
		
		//print names at the end of the tournament
		        System.out.println("rock, paper, scissors results ");
		for (int j =0; j < 4;j++){
			System.out.println(playerNames[j] + "|" + scores[j]);
		}
		
			System.out.println("Tournament complete");
		}
	}
	}
}




		
	
			
		
		
	
		

		



