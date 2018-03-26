
public class mergeShellTest {

	public static void main(String[] args) {
		
		int[] arr = new int[100000];
				
		for(int x = 0; x<arr.length; x++)
		{
			int random =(int)(Math.random() * 100000);
			arr[x] = random;
		}
		
		long startTime1 = System.currentTimeMillis();
		Sorting1.insertionSort(arr);
		long endTime1 = System.currentTimeMillis();
		
		System.out.println("The insertion sort took " + (endTime1-startTime1) +" millsec.");
		
		int[] arr2 = new int[100000];
		
		for(int x = 0; x<arr2.length; x++)
		{
			int random =(int)(Math.random() * 100000);
			arr2[x] = random;
		}
		
		long startTime2 = System.currentTimeMillis();
		Sorting1.remergeSort(arr2);
		long endTime2 = System.currentTimeMillis();
		
		System.out.println("The merge sort took " + (endTime2-startTime2) +" millsec.");
		
		
		int[] arr3 = new int[100000];
		
		for(int x = 0; x<arr3.length; x++)
		{
			int random =(int)(Math.random() * 100000);
			arr3[x] = random;
		}
		
		long startTime3 = System.currentTimeMillis();
		Sorting1.shellSort(arr3);
		long endTime3 = System.currentTimeMillis();
		
		System.out.println("The shell sort took " + (endTime3-startTime3) +" millsec.");
		
		
		
	}

}
