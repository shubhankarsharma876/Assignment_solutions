//Take name as input and print a greeting message for that name.
package firstJava;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name =sc.nextLine();
		greeting(name);
		sc.close();
	}
	
	static void greeting(String naam) {
		System.out.print("Hello " + naam);
	}

}
