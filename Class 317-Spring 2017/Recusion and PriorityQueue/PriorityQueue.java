
public class PriorityQueue {
	
	private Link root;
	
	public PriorityQueue()
	{
		root = null;
	}
	
	public void insert(int x)
	{
		Link newRoot = new Link(x);
		Link pervious = null;
		Link current = root;
		
		while(current != null && x<current.getData())
		{
			pervious = current;
			current = current.next();
		}
		
		if(pervious == null)
		{
			newRoot.setNext(root);
			root = newRoot;
		}
		
		else
		{
			pervious.setNext(newRoot);
			newRoot.setNext(current);
		}
	}
	
	public boolean isEmpty()
	{
		return (root.next()==null);
	}
	
	public void deleteFirst()
	{
		if(!isEmpty())
			root.setNext(root.next().next());
	}

}
