package exception;

public class E1 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try 
		{
			System.out.println(4/0);
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("Exception handled");
		}
		
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println("Program ends");

	}

}
