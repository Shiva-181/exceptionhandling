package exceptionhandling;

public class exceptionhandling2 {

	public static void main(String[] args) {
		
		float a,b,c;
		
		a=80;
		
		System.out.println("first number="+a);
		
		b=50;
		
		System.out.println("second number="+b);
		
		if(b != 0) {
			c=(a/b);
			System.out.println("division of two numbers="+c);
		}
		else {
			System.out.println("division by zero is not possible");
		}
	}

}
