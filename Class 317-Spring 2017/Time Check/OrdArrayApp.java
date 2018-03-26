
public class OrdArrayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrdArray arr1 = new OrdArray(100);
		OrdArray arr2 = new OrdArray(1000);
		OrdArray arr3 = new OrdArray(10000);
		for(int x = 0; x<100-1;x++)//Minus 1 because I inserted another number to be deleted 
		{
			int random =(int)(Math.random() * 101);
			arr1.insert(random);
		}
		arr1.insert(19);//inserted number
		long startTime1 = System.currentTimeMillis();
		arr1.delete(19);
		long endTime1 = System.currentTimeMillis();
		
		long startTime2 = System.currentTimeMillis();
		arr1.find(100);
		long endTime2 = System.currentTimeMillis();
		
		long startTime3 = System.currentTimeMillis();
		arr1.insert(70);
		long endTime3 = System.currentTimeMillis();
		///////////////////////////////////////////////////////////////////////////
		for(int x = 0; x<1000-1; x++)
		{
			int random =(int) Math.random()*1001;
			arr2.insert(random);
		}
		arr2.insert(19);
		long startTime4 = System.currentTimeMillis();
		arr2.delete(19);
		long endTime4 = System.currentTimeMillis();
		
		long startTime5 = System.currentTimeMillis();
		arr2.find(1000);
		long endTime5 = System.currentTimeMillis();
		
		long startTime6 = System.currentTimeMillis();
		arr2.insert(70);
		long endTime6 = System.currentTimeMillis();
		/////////////////////////////////////////////////////////////////////////////
		for(int x = 0; x<10000-1; x++)
		{
			int random =(int) Math.random()*10001;
			arr3.insert(random);
		}
		arr3.insert(19);
		long startTime7 = System.currentTimeMillis();
		arr3.delete(19);
		long endTime7 = System.currentTimeMillis();
		
		long startTime8 = System.currentTimeMillis();
		arr3.find(10000);
		long endTime8 = System.currentTimeMillis();
		
		long startTime9 = System.currentTimeMillis();
		arr3.insert(70);
		long endTime9 = System.currentTimeMillis();
		
		System.out.println("Total execution time for size 100 delete operation: " + (endTime1 - startTime1) );
		System.out.println("Total execution time for size 100 find operation: " + (endTime2 - startTime2) ); 
		System.out.println("Total execution time for size 100 insert operation: " + (endTime3 - startTime3) );
		
		System.out.println("Total execution time for size 1000 delete operation: " + (endTime4 - startTime4) );
		System.out.println("Total execution time for size 1000 find operation: " + (endTime5 - startTime5) ); 
		System.out.println("Total execution time for size 1000 insert operation: " + (endTime6 - startTime6) ); 
		
		System.out.println("Total execution time for size 10000 delete operation:" + (endTime7 - startTime7) );
		System.out.println("Total execution time for size 10000 find operation: " + (endTime8 - startTime8) ); 
		System.out.println("Total execution time for size 10000 insert operation: " + (endTime9 - startTime9) ); 

	}

}