package Week.day2;

public class Calculator {

	public void add(int a, int b) {
		System.out.println("The value of ADDITION : " + (a + b));
	}

	public void sub(float a, float b)
	{
		float c = a-b;
		System.out.println(" The value of SUBTRACTION : " +c);
	}

	public void mul(double a, double b) 
	{
		double c = a*b;
		System.out.println(" The value of MULITPLICATION : " + c);
	}

	public void div(long a, long b) 
	{
		long c = a%b;
		System.out.println(" The value of DIVISION : " + c);
	}
}
