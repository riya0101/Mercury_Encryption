
public class StringFirstUpper
{

	 public static void main(String[] args) 
	 {
		String source = "hello good old world";
	    StringBuffer res = new StringBuffer();
	
	    String[] strArr = source.split(" ");
	    for (String str : strArr) 
	    {
	        char[] stringArray = str.trim().toCharArray();
	        stringArray[0] = Character.toUpperCase(stringArray[0]);
	        str = new String(stringArray);
	
	        res.append(str).append(" ");
        }

    System.out.print("Result: " + res.toString().trim());

     }
}
