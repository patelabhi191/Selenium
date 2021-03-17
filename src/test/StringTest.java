package test;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char a = 'a';
		char b = '1';
		System.out.println(a + " - " + b);
		String output = Character.toString(a);
		System.out.println(output);
		
		String name = "This is Sparta";
		System.out.println(name);
		
		int i = 10;
		int j = 100;
		String space = "  ";
		
		System.out.println(name + "  " + i+j);
		System.out.println(i+space+j+space+name);
		System.out.println(i+j+space+name);
	}

}
