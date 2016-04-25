package SlotMachine1;

import java.util.Random;

public class slots {
	private static int wheel1;
	private static int wheel2;
	private static int wheel3;
	private static int gameWin;
	
	public static int randomGen(){
		Random r = new Random ();
		int random  = r.nextInt(5)+1;
		return random;
	}
	
	public static void checkWin (){
		wheel1= randomGen ();
		wheel2= randomGen ();
		wheel3= randomGen ();
		//printBoard
		printBoard();
		//check for win and send to pay
		if (wheel1 == wheel2 && wheel2 == wheel3){
			gameWin= wheel1;
			payOut();
			System.out.println("You're a Winner!!!!" + "\n");
		}else {
			System.out.println("You lose!" + "\n");
		}
		System.out.println("Your bank: $" + player.getBank());
	}
	
	public static void payOut (){
		switch (gameWin){
		case 1: 
				player.setBank((player.getBank()+(player.getBet()*2)));
		case 2: 
				player.setBank((player.getBank()+(player.getBet()*3)));
		case 3: 
				player.setBank((player.getBank()+(player.getBet()*4)));
		case 4: 
				player.setBank((player.getBank()+(player.getBet()*5)));
		case 5: 
				player.setBank((player.getBank()+(player.getBet()*10)));
		}
	}
	
	public static void printBoard(){
		System.out.println(wheel1 + " | " + wheel2 + " | " + wheel3);
	}
}
