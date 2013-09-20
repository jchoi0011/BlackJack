
public class Dealer {
	public Dealer()
	{
		
	}
	int[] dHand;
	dHand = new int[5];
	String[] DisDHand;
	DisDHand = new String[5];
	int handDTot;
	
	int curDTot()							// adding the total of the dealer's current hand
	{
		handDTot = dHand[0] + dHand[1] + dHand[2] + dHand[3] + dHand[4];
		return handDTot;
	}
}
