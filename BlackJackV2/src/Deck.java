import java.util.Random;
public class Deck {
	int[] cardValue = {1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,11,11,11,11};

	String[] dispCard = {"1","1","1","1","2","2","2","2","3","3","3","3","4","4","4","4","5","5","5","5","6","6","6","6","7","7","7","7",
        "8","8","8","8","9","9","9","9","10","10","10","10","J","J","J","J","Q","Q","Q","Q","K","K","K","K","A","A","A","A"};
	int immeCard;						// returning card value
	
	int getRandomVal()					// choosing a random card out of the deck and returning it
	{
		int cardV;
		Random gen = new Random();
		int key = gen.nextInt(52);
		cardV = cardValue[key];
		immeCard = cardV;
		return cardV;
	}
	
	String getDispCard()				//returning the string value of the said returned card
	{	
		String cardFace;
		cardFace = dispCard[immeCard];
		return cardFace;
	}
}
