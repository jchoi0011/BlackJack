import java.util.Scanner;	
public class Bet													// This is the class to start off the bet
{
	public Bet()													// constructor for this class
	{	
	}
	public int shoot;
	public int betVal;	
	public int addBet()												// method to start the betting process
	{
	PlayAction dit = new PlayAction();
	int wallet = dit.wallet;
													
	do																// do while loop for less than the minimum bet or greater than your current wallet
	{
		System.out.println("Minimum Bet is 20, and you have " + Integer.toString(wallet)); 		//toString requirement
		Scanner totBet1 = new Scanner(System.in);
		betVal = totBet1.nextInt();
		if (betVal < 20)											// condition for bet being less than minimum bet
		{
			System.out.println("Minimum Bet is 20!");				
		}
		if (betVal > wallet)										// condition for bet being more than your current wallet
		{
			System.out.println("You don't have that much to bet!");
		}
	}
		while (betVal <20 || betVal > wallet);
	
	shoot = betVal;
	dit.setBetAmt(betVal);
	return betVal;
	}
	
	public void setShoot(int shoot)									//setter
	{
		this.shoot = shoot;
	}

	public int getShoot()											//getter
	{
		return shoot;
	}
}