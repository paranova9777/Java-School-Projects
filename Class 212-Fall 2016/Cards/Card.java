
public class Card {
	
	private int value;
	private String suit;
	
	public Card()
	{
		value = (int)(Math.random()*12+1);
		int random = (int)(Math.random()*4);
		if(random==0)
		{
			suit = "Diamonds";
		}
		if (random==1)
		{
			suit = "Hearts";
		}
		if(random == 2)
		{
			suit = "Clubs";
		}
		if(random ==3)
		{
			suit = "Spades";
		}
		
	}
	
	public Card(int v,String c)
	{
		value = v;
		suit = c;
	}

	public int getValue()
	{
		return value;
	}
	
	public void setValue(int v)
	{
		value = v;
	}
	
	public String getSuit()
	{
		return suit;
	}
	
	public void setSuit(String c)
	{
		suit = c;
	}
	
	public String toString()
	{
		switch(value)
		{
		case 1:
			return "Ace of "+ suit;
			
		case 11:
			return "Jack of "+ suit;
			
		case 12:
			return "Queen of "+ suit;
			
		case 13:
			return "King of "+ suit;
			
		default:
			return value + " of "+ suit;
			
		}
	}
	public boolean equals(Card c2)
	{
		return(value==c2.value && suit.equals(c2.suit));
	}
}
