package sharvari;

public class exception {

	public static void main(String[] args)
	{
		try
		{
			int a=100/0;
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	
		
	}
	
}
