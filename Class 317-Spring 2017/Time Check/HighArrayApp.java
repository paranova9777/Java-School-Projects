
public class HighArrayApp {

	public static void main(String[] args) {
		HighArray arr1 = new HighArray(100);
		HighArray arr2 = new HighArray(1000);
		HighArray arr3 = new HighArray(10000);
		
		for(int x = 0; x<100-1;x++)//Minus 1 because I inserted another number to be deleted 
		{
			long random =(long)(Math.random() * 101);
			arr1.insert(random);
		}
		arr1.insert(7);//inserted number
		long startTime1 = System.currentTimeMillis(); 
		arr1.delete(7);
		long endTime1 = System.currentTimeMillis();
		
		long startTime2 = System.currentTimeMillis();
		arr1.find(100);
		long endTime2 = System.currentTimeMillis();
		
		long startTime3 = System.currentTimeMillis();
		arr1.insert(6);
		long endTime3 = System.currentTimeMillis();
		/////////////////////////////////////////////////////////////////////
		for(int x = 0; x<1000-1; x++)
		{
			long random = (long)(Math.random()*1001);
			arr2.insert(random);
		}
		arr2.insert(500);
		long startTime4 = System.currentTimeMillis(); 
		arr2.delete(500);
		long endTime4 = System.currentTimeMillis();
		
		long startTime5= System.currentTimeMillis();
		arr2.find(1000);
		long endTime5 = System.currentTimeMillis();
		
		long startTime6 = System.currentTimeMillis();
		arr2.insert(100);
		long endTime6 = System.currentTimeMillis();
		///////////////////////////////////////////////////////////////////////
		for(int x = 0; x<10000-1; x++)
		{
			long random = (long)(Math.random()*10001);
			arr3.insert(random);
		}
		arr3.insert(5000);
		long startTime7 = System.currentTimeMillis(); 
		arr3.delete(5000);
		long endTime7 = System.currentTimeMillis();
		
		long startTime8= System.currentTimeMillis();
		arr3.find(10000);
		long endTime8 = System.currentTimeMillis();
		
		long startTime9 = System.currentTimeMillis();
		arr3.insert(1000);
		long endTime9 = System.currentTimeMillis();
		
		
		 System.out.println("Total execution time for size 100 delete operation: " + (endTime1 - startTime1) ); 
		 System.out.println("Total execution time for size 100 find operation: " + (endTime2 - startTime2));
		 System.out.println("Total execution time for size 100 insert operation: " + (endTime3 - startTime3));
		 
		 System.out.println("Total execution time for size 1000 delete operation: " + (endTime4-startTime4));
		 System.out.println("Total execution time for size 1000 find operation: " + (endTime5-startTime5));
		 System.out.println("Total execution time for size 1000 insert operation: " + (endTime6-startTime6));
		 
		 System.out.println("Total execution time for size 10000 delete operation: " + (endTime7-startTime7));
		 System.out.println("Total execution time for size 10000 find operation: " + (endTime8-startTime8));
		 System.out.println("Total execution time for size 10000 insert operation: " + (endTime9-startTime9));
	}

}