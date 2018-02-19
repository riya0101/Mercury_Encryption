
public class ReverseString {
 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		String mystring= "sonali";
		char[] char_array=mystring.toCharArray();
		
		//System.out.println(char_array.length);
		
		for (int i= char_array.length-1;i>=0;i--)
		{
			System.out.print(char_array[i]);
		}
	}

}
