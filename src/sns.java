
public class sns {
	static int i=100;
	 
	 public static void main(String[] args) {
	  System.out.println("In Main Method=>"+sns.i);/*Classname.staticvariable*/
	  int k;
	  foo();/*Only static Method will be called from static main class*/

	 }

	 public static void method1()
	 {
	  System.out.println("this is static method :- method1");
	  //foo();
	  
	 }
	 
	 
	 public static void foo()
	 {
	  method1();/*Call to static method*/
	  System.out.println("In foo Method=>"+i);
	 }
	
}
