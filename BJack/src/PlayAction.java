// dealing with money actions will occur here in this class
public class PlayAction 
{
	public int wallet = 500;			// Start off values...starting with 500 units
	public int pot;						// Start off values...starting with 0 units in pot
	public int betAmt;					// Start off values...starting with 0 units as bet amount
	
	public PlayAction()					// constructor for this class
	{	
	}
	
	
	public int getWallet() 						// getter for wallet
	{
		return wallet;
	}
	
	public void setWallet(int wallet)			// setter for wallet
	{
		this.wallet = wallet;
	}
	
	public int getPot() 						// getter for pot
	{
		return pot;
	}
	
	public void setPot(int pot)					// setter for pot
	{
		this.pot = pot;
	}
	
	public int getBetAmt() 						// getter for betAmt
	{

		return betAmt;
	}
	
	public void setBetAmt(int betAmt)			// setter for betAmt
	{
		this.betAmt = betAmt;
		System.out.println("setBetAmt " + Integer.toString(betAmt));			// toString
	}

}
