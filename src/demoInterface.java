
public class demoInterface implements MyInterface {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demoInterface mi= new demoInterface();
		mi.method1();
		System.out.println(MyInterface.i);
		System.out.println(SuperInterface.i);
		

	}


	public void method1() {
		System.out.println("child interface");
		
	}


	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("parent interface");
		
	}


	public void method3() {
		System.out.println("parent interface");
		
	}

	
	public void method4() {
		System.out.println("parent interface");
		
	}

}
