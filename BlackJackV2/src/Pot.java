
public class Pot 
{
	int wallet;
	public Pot()
	{
		
	}
	int pool;
	int result;								// needs to call result from Play class method result()
	
	int calcResult()
	{
		if (result == 0)					// result = 0 means a loss
		{
			//wallet -= pool;
			//pool = 0;
		}
		if (result == 1)					// result = 1 means a win
		{
			//wallet += pool;
			//pool + 0;
		}
										// all other values result in keeping the value of pool
		return wallet;					
	}
}
