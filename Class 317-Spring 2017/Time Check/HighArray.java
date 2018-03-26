
public class HighArray {
	private long[] a;
	private int n;
	
	public HighArray(int max)
	{
		a = new long[max];
		n = 0;
	}
	public boolean find (long search)
	{
		int x;
		for(x = 0; x<n; x++){
			if(a[x] == search)
				break;
			}
			if (x == n )
				return false;
			else
				return true;
	}
	public void insert(long value)
	{
		a[n]=value;
		n++;
	}
	public boolean delete(long value)
	{
		int x;
		for(x=0;x<n; x++)
		{
			if(value == a[x])
				break;
		}
		if(x==n)
			return false;
		else
		{
			for(int k = x;k<n-1;k++)
			{
				a[k] = a[k+1];
			}
			n--;
			return true;	
		}
	 }
	public void display()
	{
		for(int x= 0; x<n; x++)
		{
			System.out.print(a[x] + " ");
		}
		System.out.println("");
	}
}
