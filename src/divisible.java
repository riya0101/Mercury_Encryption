
public class divisible {

	public static void main(String[] args) {
	
	
		for (int x=1;x<=15;x++)
		{
			if (x%3==0 && x%5==0)
			{
			    System.out.println(x+" <===Number is divisible By 3 & 5");
			}
			else if (x%3==0)
			{
				System.out.println(x+ "<===Number is divisible By 3");
			}
			else if (x%5==0)
			{
				System.out.println(x+ "<===Number is divisible By 5");
			}
			else
			{
				System.out.println(x);
			}
		}

	}

}
