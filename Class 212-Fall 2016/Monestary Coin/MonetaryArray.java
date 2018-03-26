import java.util.ArrayList;

public class MonetaryArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonetaryCoin c1 = new MonetaryCoin();
		MonetaryCoin c2 = new MonetaryCoin();
		MonetaryCoin c3 = new MonetaryCoin();
		MonetaryCoin c4 = new MonetaryCoin();
		MonetaryCoin c5 = new MonetaryCoin();
		
		ArrayList<MonetaryCoin> coins = new ArrayList<MonetaryCoin>();
		coins.add(c1);
		coins.add(c2);
		coins.add(c3);
		coins.add(c4);
		coins.add(c5);
		
		int index = 0;
		
		while(index < coins.size())
		{
			System.out.println(coins.get(index));
			index++;
		}
	}

}
