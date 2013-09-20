
public class BlackJack {

	public static void main(String[] args)												// Main constructor
	{	
		int green = 500;
		int bowl = 0;
		int handOver = 0;
		PlayAction action = new PlayAction();											// creating a new object in PlayAction class
		Bet newAmt = new Bet();															// creating a new object in Bet class
		TieAction itsTie = new TieAction();												// creating a new object in TieAction class	
		action.setPot(bowl);															// setter
		action.setWallet(green);														// setter
		action.setBetAmt(handOver);														// setter
		
		int wallet = action.getWallet();												// invoking method getWallet from PlayAction class
		int bet = newAmt.addBet();														// invoking method addBet from Bet class
		int pot = itsTie.putPot();														// invoking method putPot from TieAction class
		int gPot = action.getPot();
		int gBetAmt = action.getBetAmt();
		int gShoot = newAmt.getShoot();
		int gBetVal = newAmt.getBetVal();
		int gBasePot = itsTie.getBasePot();
		int gTBetAmt = itsTie.getBetAmt();
		
		
		
		System.out.println("Wallet size is: " + wallet);								// printing out the current wallet size
		System.out.println("This is how much you are betting: " + bet);					// printing out the current bet
		System.out.println("This is how much is being added to the Pot: " + pot);		// printing out the current pot size
		System.out.println("gPot: " + gPot);
		System.out.println("gBetAmt: " + gBetAmt);
		System.out.println("gShoot: " + gShoot);
		System.out.println("gBetVal: " + gBetVal);
		System.out.println("gBasePot: " + gBasePot);
		System.out.println("gTBetAmt: " + gTBetAmt);

		
	}

}
