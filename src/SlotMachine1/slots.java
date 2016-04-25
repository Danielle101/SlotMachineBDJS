package SlotMachine1;

public class slots {
	private static int wheel1;
	private static int wheel2;
	private static int wheel3;
	private static int gameWin;
	
	public static int randomGen(){
		double a =  Math.random() * (5);
		int random = (int) a;
		return random;
	}
	
	public static void checkWin (){
		wheel1= randomGen ();
		wheel2= randomGen ();
		wheel3= randomGen ();
		//check for win and send to pay
		if (wheel1 == wheel2 && wheel2 == wheel3){
			gameWin= wheel1;
		}
	}
	
	public static void payOut (){
		checkWin();
		switch (gameWin){
		case 1: //player bank +=10;
				player.setBank((player.getBank()+(player.getBet()+10)));
		case 2: //player bank +=20;
				player.setBank((player.getBank()+(player.getBet()+20)));
		case 3: //player bank +=30;
				player.setBank((player.getBank()+(player.getBet()+30)));
		case 4: //player bank +=40;
				player.setBank((player.getBank()+(player.getBet()+40)));
		case 5: //player bank +=50;
				player.setBank((player.getBank()+(player.getBet()+50)));
		}
	}
}
