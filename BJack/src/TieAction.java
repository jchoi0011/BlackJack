
public class TieAction										// This class is for the action in case of a draw on the hands
															// between the player and dealer - the action will be to put the current bet
{															// amount into the betting pool for the next game.
	private int basePot;										
	private int betAmt;
	PlayAction tie = new PlayAction();	
	public TieAction()										// Constructor for this class
	{
	}
	

	public int putPot()										// method for the calculation to add money into the pot for the next round
	{														
		
															// creating a new object within the class PlayAction
		Bet small = new Bet();
		basePot = tie.pot;									// invoking the method getPot from class PlayAction	
		betAmt = small.shoot;								// invoking the variable from class PlayAction
		basePot += betAmt;									// adding the bet amount to the pot for use on next game
		System.out.println("betAmt " + Integer.toString(betAmt));				//	test for toString requirement
		System.out.println("basePot " + Integer.toString(basePot));				// 	test for toString requirement
		return basePot;
	}
	public void setBasePot(int basePot)						//setter
	{
		this.basePot = basePot;								
	}
	public int getBasePot()									//getter
	{
		return basePot;
	}
	public void setBetAmt(int betAmt)						//setter
	{
		this.betAmt = betAmt;
	}
	public int getBetAmt()									//getter
	{
		return betAmt;
	}
}
