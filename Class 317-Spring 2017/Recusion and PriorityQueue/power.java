
public class power {
	
	public static int power(int x, int y)
	{
		if(y==1)
			return x;
		else if(y%2==1)
			return power(x*x,y/2)*x;
		else 
			return power(x*x,y/2);
	}

	public static void main(String[] args) {
		
		System.out.println(power(2,8));

	}

}
