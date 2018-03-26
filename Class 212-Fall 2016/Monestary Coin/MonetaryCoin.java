
public class MonetaryCoin {
	private int faceValue;
	private String face;
	
	public MonetaryCoin()
	{
		faceValue = 1;
		int random;
		random  =  (int)(Math.random()*2);
		
		if (random ==0)
			{face = "head";
			}
		else
			{face ="tails";
			}
	}
	
	public MonetaryCoin(int f, String c)
	{
		faceValue = f;
		face = c;
	}
	
	public int getfaceValue()
	{
		return faceValue;
	}
	
	public String getFace()
	{
		return face;
	}
	
	public void setfaceValue(int f)
	{
		faceValue = f;
	}
	
	public void setFace(String c)
	{
		face = c;
	}
	
	public String toString()
	{
		return "Value of the coin is " + faceValue + " and the coin is on " + face;
	 }
	public int add(MonetaryCoin c)
	{
		int cFaceValue = c.faceValue;
		int Sum = faceValue+cFaceValue;
		return Sum;
	}
	
	public void flip()
	{
		int random;
		random  =  (int)(Math.random()*2);
		
		if (random == 0)
			{face = "head";
			}
		else
			{face ="tails";
			}
	}
	
	public boolean equal(MonetaryCoin c2)
	{
		int c2FaceValue = c2.faceValue;
		String c2face = c2.face;
		
		if (c2face==face && c2FaceValue==faceValue)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
