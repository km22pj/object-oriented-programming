package BasicIO;
import java.util.Scanner;
class BasicIO {
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		Scanner t = new Scanner(System.in);
		Scanner k = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = stdin.nextLine();
		System.out.print("Enter your years: ");
		String years = t.nextLine();
		System.out.print("Enter your height: ");
		System.out.print("your name is " + name + " " +years);
	}
}
