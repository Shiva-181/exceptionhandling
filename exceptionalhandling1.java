package exceptionhandling;



public class exceptionalhandling1 {

	public static void main(String[] args) {
		
		int a,b,c;
		
		a = 10;
		System.out.println("First number=" + a);
		
		b = 2;
		System.out.println("Second number=" + b);
		
		c = a / b; //Exception here.
		
		//Lines after that are not executed.
		System.out.println("Division of the two numbers =" + c);

	}

}
