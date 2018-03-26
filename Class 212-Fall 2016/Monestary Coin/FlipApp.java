import java.util.Scanner;

public class FlipApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonetaryCoin c1,c2;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first coin's value: ");
		int faceValue1= scan.nextInt();
		
		System.out.print("Enter weither the first coin is heads or tails: ");
		String face1 = scan.next();
		
		System.out.print("Enter the second coin's value: ");
		int faceValue2 = scan.nextInt();
		
		System.out.print("Enter weither the coin is heads or tails: ");
		String face2 = scan.next();
		
		c1 = new MonetaryCoin(faceValue1, face1);
		c2 = new MonetaryCoin(faceValue2, face2);
		
		c1.flip();
		c2.flip();
		System.out.println("The first coin fliped to " + c1.getFace());
		System.out.println("The second coin fliped to " + c2.getFace());
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		int sum = c1.add(c2);
		System.out.println("Together the coins face values are " + sum);
		
		boolean equal = c1.equal(c2);
		if (equal)
		{
			System.out.println("Both the coins show the same face!");
		}
		else
		{
			System.out.println("Better luck next time.");
		}
	}

}
