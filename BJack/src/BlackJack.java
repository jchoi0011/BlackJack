
public class BlackJack {

	public static void main(String[] args)												// Main constructor
	{
		PlayAction action = new PlayAction(500, 0, 0);									// creating a new object in PlayAction class
		Bet newAmt = new Bet();															// creating a new object in Bet class
		TieAction itsTie = new TieAction();												// creating a new object in TieAction class
		int wallet = action.getWallet();												// invoking method getWallet from PlayAction class
		int bet = newAmt.addBet();														// invoking method addBet from Bet class
		int pot = itsTie.putPot();														// invoking method putPot from TieAction class
		System.out.println("Wallet size is: " + wallet);								// printing out the current wallet size
		System.out.println("This is how much you are betting: " + bet);					// printing out the current bet
		System.out.println("This is how much is being added to the Pot: " + pot);		// printing out the current pot size

	}

}
