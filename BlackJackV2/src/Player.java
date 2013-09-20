
public class Player 
{
	public Player()
	{
		
	}
	int pHand[];
	pHand = new int[5];
	String DisPHand[];
	DisPHand = new String[5];
	int wallet;
	int handPTot;
	
	int curPTot()								// adding the total of the player's current hand
	{
		handPTot = pHand[0] + pHand[1] + pHand[2] + pHand[3] + pHand[4];
		return handPTot;
	}
}
