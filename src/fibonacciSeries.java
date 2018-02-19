
public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b =1;
		int sum;

	    System.out.print(a+" "+b);   //printing 0 and 1    
				    
		for(int i=0; i<10; i++)
		{    
			sum= a+b;   
			System.out.print(" "+sum);    
			a=b;    //1
		    b=sum;    //1
		}    


	}

}
