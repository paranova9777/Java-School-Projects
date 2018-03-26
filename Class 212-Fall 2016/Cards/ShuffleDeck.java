import java.util.ArrayList;

public class ShuffleDeck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card[] deck = new Card[52];
		String[] suits = {"Diamonds","Hearts","Clubs","Spades"};
		int x =0;
		for(int index = 0; index<4; index++)
		{
			for(int index2=1;index2<=13;index2++)
			{
				deck[x]= new Card(index2,suits[index]);
				x++;
			}
		}
		for(Card myDeck:deck)
		{
			System.out.println(myDeck);
		}
		
		System.out.println("\t");
		
		for(int index=0;index<52;index++)
		{
			int random = (int)(Math.random()*52);
			Card temp = deck[index];
			deck[index]=deck[random];
			deck[random]=temp;	
		}
		
		for(Card myDeck:deck)
		{
			System.out.println(myDeck);
		}
			
	}

}