
public class Stack {
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public Stack(int size)
	{
		maxSize = size;
		top = -1;
		stackArray = new char[size];
	}
	
	public boolean push(char n)
	{
		if(!isFull())
		{
			stackArray[++top] = n;
			return true;
		}
		else
			return false;
	}
	
	public char pop()
	{
		if(!isEmpty())
			return stackArray[top--];
		else
			return '@';
	}
	
	public char peek()
	{
		return stackArray[top];
	}
	
	public boolean isFull()
	{
		return top == maxSize-1;
	}
	
	public boolean isEmpty()
	{
		return top == -1;
	}
	
	public void display()
	{
		for(int x = 0; x<stackArray.length;x++)
		{
			System.out.println(stackArray[x]);
		}
	}

}
