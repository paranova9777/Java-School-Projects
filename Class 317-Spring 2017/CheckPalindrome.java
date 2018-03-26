import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String s2 = s.toLowerCase();
		String[] n = {" ","!",".", ",","?"};
		for(int x = 0;x<n.length;x++)
		{
			s2 = s2.replace(n[x], "");
		}
		Stack myStack = new Stack(s2.length());
		for(int x = 0 ; x<s2.length(); x++)
		{
			char c = s2.charAt(x);
			myStack.push(c);
		}
		String outcome = "";
		for(int x = 0; x<s2.length();x++)
		{
			outcome = outcome + myStack.pop();
		}
		if(outcome.equals(s2))
			System.out.println("Yes this is a palindrome");
		else
			System.out.println("Sorry not a palindrome");
	}

}
