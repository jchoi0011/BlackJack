import java.util.Scanner;
public class Bet {
int betAmt;

int addBet()									// method to start the betting
{
	
	do
	{
		System.out.println("Minimum Bet is 20, and you have " + Integer.toString(wallet));
		System.out.println("How much do you want to bet?");
		Scanner push = new Scanner(System.in);
		int betAmt = push.nextInt();
		if (betAmt < 20)						// condition for bet being less than minimum bet
		{
			System.out.println("MINIMUM BET IS 20!");
		}
		if (betAmt > wallet)					// condition for bet being more than what you have
		{
			System.out.println("You do not that have much to bet.");
		}
	}
	while (betAmt < 20 || betAmt > wallet);
	
	
	return betAmt;
}
int getCurBet()									// getter for the betAmt
{
	return betAmt;
}
}
