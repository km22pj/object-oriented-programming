
public class LowerCaseTester {

	public static void main(String[] args) {
		String greeting = "Hello, World!";
		int n = greeting.length();
		String river = "Mississippi";
		String bigRiver = river.toUpperCase();
		String testString = "This is a Test";
		String smallTestString = testString.toLowerCase();
		System.out.println(n);
		System.out.println(bigRiver);
		System.out.println(smallTestString);
		String bigTestString = smallTestString.toUpperCase();
		System.out.println(bigTestString); 
	}

}
