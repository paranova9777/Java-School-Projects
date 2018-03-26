
public class CardGame {

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
		for(int index=0;index<52;index++)
		{
			int random = (int)(Math.random()*52);
			Card temp = deck[index];
			deck[index]=deck[random];
			deck[random]=temp;	
		}
		
		int sum1 = 0;
		int sum2 = 0;
		
		Card[] computers = new Card[3];
		System.out.println("Computer's hand:");
		for(int index = 0 ; index<3; index++)
		{
			computers[index]=deck[index];
			System.out.println(computers[index]);
			sum1 =sum1 + computers[index].getValue();
		}
		
		Card[] player = new Card[3];
		System.out.println();
		System.out.println("Player's hand:");
		for(int index = 0 ; index<3; index++)
		{
			player[index]=deck[index+3];
			System.out.println(player[index]);
			sum2 =sum2 + player[index].getValue();
		}
		
		if (sum1<sum2)
		{
			System.out.println("User is the Winner!");
		}
		
		else if(sum1>sum2)
		{
			System.out.println("The computer is the Winner!");
		}
		else
		{
			System.out.println("It's a Tie!");
		}

	}

}
