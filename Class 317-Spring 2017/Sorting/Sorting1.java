
public class Sorting1 {
	public static void bubbleSort(int[] arr)
	{
		for(int y = 0; y<arr.length;y++)
		{
			for(int x = 0;x<arr.length-1-y; x++)
			{
				if(arr[x]>arr[x+1])
				{
					int temp = arr[x+1];
					arr[x+1] = arr[x+1];
					arr[x] = temp;
				}
			}
		}
	}
	
	public static void selectionSort(int[] arr)
	{
		for(int y =0; y<arr.length; y++)
		{
			int min = y;
			for(int x = y; x<arr.length; x++)
			{
				if(arr[x]<arr[min])
				{
					min = x;
				}
			}
			int temp = arr[min];
			arr[min] = arr[y];
			arr[y] = temp;
		}
	}
	
	public static void insertionSort(int[] arr)
	{
		int x,y;
		
		for(x = 1; x<arr.length; x++)
		{
			int temp = arr[x];
			y=x;
			while(y>0 && arr[y-1]>= temp)
			{
				arr[y] = arr[y-1];
				--y;
			}
			arr[y] = temp;
		}
	}
	
	public static void reverse(int[] arr)
	{
		
		for(int x = 0; x <arr.length/2 ; x++)
		{
			int temp = arr[x];
			arr[x] = arr[arr.length - x - 1];
			arr[arr.length - x - 1] = temp;
		}
	}
	
	public static boolean isSorted(int[] a)
	{   for (int i = 0; i < a.length - 1; i++)
		if (a[i] > a[i + 1])
			return false;
		return true; 
	}
	private static int[] result;
	
	public static void remergeSort(int[] arr)
	{
		int size = arr.length;
		result = new int[size];
		mergeSort(arr,0,size-1);
	}
	public static void mergeSort(int[] array, int low, int high)
	{ 
		if(low==high)
			return;
		else
		{
			int mid = (low + high)/2;
			mergeSort(array,low,mid);
			mergeSort(array,mid+1,high);
			merge(array, low, mid+1, high);
		}	
	}
	
	private static void merge(int[] array, int low, int high, int upperBound)
	{ 
		int index = 0; 
		int lowerBound = low; int mid = high-1; 
		int nElem = upperBound-lowerBound+1;
		
		while(low <= mid && high <= upperBound) 
			if( array[low] < array[high] )
				result[index++] = array[low++]; 
			else result[index++] = array[high++];
		
		while(low <= mid) 
			result[index++] = array[low++];
		
		while(high <= upperBound) 
			result[index++] = array[high++];
		
		for(index=0; index<nElem; index++) 
			array[lowerBound+index] = result[index];
    }
	
	public static void shellSort(int[] array) {
	    int in, out;
	    int temp;
	 
	    int h = 1;
	    while (h <= array.length / 3) {
	      h = h * 3 + 1;
	    }
	    while (h > 0) {
	      for (out = h; out < array.length; out++) {
	        temp = array[out];
	        in = out;
	 
	        while (in > h - 1 && array[in - h] >= temp) {
	          array[in] = array[in - h];
	          in -= h;
	        }
	        array[in] = temp;
	      }
	      h = (h - 1) / 3;
	    }
	  }
}
