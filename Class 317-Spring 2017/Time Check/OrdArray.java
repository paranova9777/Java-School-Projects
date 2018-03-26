
public class OrdArray {
	private long[] a;
	private int n;
	
	public OrdArray(int max){
		a = new long[max];
		n=0;
	}
	public int size(){
		return n;
	}
	
	public int find(long search)
	{
		int lowerBound = 0;
		int upperBound = n - 1;
		int current;
		
		while(true)
		{
			current = (lowerBound + upperBound)/2;
			if(a[current]==search)
				return current;
			else if(lowerBound>upperBound)
				return n;
			else
			{
				if(a[current]<search)
					lowerBound = current + 1;
				else
					upperBound = current - 1;
			}
		}
	}
	public void insert(long value)
	{
		int x;
		for(x=0;x<n;x++)
			if(a[x]>value)
				break;
		for(int y = n; y>x; y--)
			a[y] = a[y-1];
		a[x] = value;
		n++;
	}
	
	public void display()
	{
		for(int x=0; x<n; x++)
			System.out.print(a[x] + " ");
		System.out.print("");
	}
	public boolean delete(long value){
		int x = find(value);
		if(x==n)
			return false;
		else
		{
			for(int y = x; y<-1; y++)
				a[y] = a[y+1];
			n--;
			return true;
		}
	}
}
