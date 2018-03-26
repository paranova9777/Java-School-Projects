
public class radixSort {
	
	public static void sort(int[] data) {
		int divisor = 1;
		int m = data[0];
		for(int i = 0;i<data.length;i++)
		{
			if(data[i]>m)
				m=data[i];
		}
		doubleEndLink[] basket= new doubleEndLink[10];
		for(int i = 0; i<10;i++)
			basket[i] = new doubleEndLink();
		
		while(m/divisor>0)
		{
			for(int i =0;i<data.length;i++)
			{
				int place =(data[i]/divisor) %10;
				basket[place].insertLast(data[i]);	
			}
			int j = 0;
			for(int i = 0; i<10;i++)
			{
				while(!basket[i].isEmpty())
				{
					int num =(int)basket[i].deleteFirst();
					data[j++] = num;
				}
			}
			divisor*=10;
		}
	}
	
	public static void main(String[] args){
		int[] arr = new int[100];
		
		for(int x = 0; x<arr.length; x++)
		{
			int random =(int)(Math.random() * 10000);
			arr[x] = random;
		}
		
		radixSort.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
	         if (i > 0) {
	            System.out.print(", ");
	         }
	         System.out.print(arr[i]);
	}
}
}
