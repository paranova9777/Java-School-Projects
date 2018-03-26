
public class Queue {
	
	private int maxSize;
	private int[] qArray;
	private int front;
	private int rear;
	private int nItems;
	
	public Queue(int size)
	{
		qArray = new int [size];
		maxSize = size;
		front = 0;
		rear= -1;
		nItems = 0;
	}
	
	public boolean insert(int item)
	{
		if(isFull())
			return false;
		else{
			if(rear == maxSize-1)
				rear=-1;
			qArray[++rear] = item;
			nItems++;
			return true;
		}
	}
	
	public long remove()
	{
		if(!isEmpty())
		{
			nItems--;
			long temp = qArray[front++];
			if(front == maxSize)
				front = 0;
			return temp;
		}
		else
			return -9999;
			
	}
	
	public long peekFront()
	{
		if(!isEmpty())
			return qArray[front++];
		else
			return -9999;
	}
	
	public boolean isEmpty()
	{
		return nItems == 0;
	}
	
	public boolean isFull()
	{
		return nItems == maxSize;
	}
	
	public int size()
	{
		return nItems;
	}
	
	public void display()
	{
		if(isEmpty())
			System.out.println("Queue is Empty.");
		
		else if(rear < front)
		{
			for(int x = front; x<maxSize; x++)
				System.out.println(qArray[x]);
			
			for(int x = 0; x<= rear;x++)
				System.out.println(qArray[x]);
		}
		else if(front<= rear)
		{
			for(int x = front; x <= rear; x++)
				System.out.println(qArray[x]);
		}
			
	}

}
