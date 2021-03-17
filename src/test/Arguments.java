package test;

public class Arguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum(1, 9);
		sum(1, 9, 4);
		sum(1.2,9.3,10.5);
		System.out.println("Addition is "+addition(1,9));
	}

	public static void sum(int a, int b) {
		int s = a + b;
		System.out.println(s);
	}

	public static void sum(int a, int b, int c) {
		int s = a + b + c;
		System.out.println(s);
	}
	
	public static void sum(double a, double b, double c) {
		double s = a + b + c;
		System.out.println(s);
	}
	
	private static int addition (int a, int b) {
		// TODO Auto-generated method stub
		int add = a+b;
		return add;
	}
}
