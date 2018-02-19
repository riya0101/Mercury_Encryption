
public class NoStatic {

	public static void main(String[] s) {
		// TODO Auto-generated method stub
		
	
		
//		String str ="Hello";
//		str ="Bye";
//		
//		System.out.println(str);
		
		
		StringBuffer demo1 = new StringBuffer("Hello") ;
		// The above object stored in heap and its value can be changed .
		demo1=new StringBuffer("Bye");
		
		System.out.println(demo1);


	}

}
