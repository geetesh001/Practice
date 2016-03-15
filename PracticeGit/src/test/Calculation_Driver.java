package test;

public class Calculation_Driver {
	
	static int a=100;
	static	int b=50;

	public static void main(String[] args) {
		Calculation cal = new Calculation();
		int add = cal.add(a, b);
		int substract = cal.substract(a, b);
		
		System.out.println("Addition of two number : "+add);
		System.out.println("Substraction of two number : "+substract);
		
		System.out.println("Hello world");
		System.out.println("hi how you doing");
		
	}

}
