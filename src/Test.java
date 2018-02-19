
public class Test {
	int i;

	 Test(int i) {
	  i = i;
	  System.out.println("value i in test:-"+i);
	 }

	 public static void main(String[] args) {

	  Test t = new Test(7);
	  System.out.println(t.i);
	 }
}
