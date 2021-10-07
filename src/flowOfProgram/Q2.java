//Take two numbers and print the sum of both.
package flowOfProgram;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a =sc.nextInt();
		System.out.print("Enter the second number: ");
		int b =sc.nextInt();
		
		int sum = a+b;
		System.out.print(sum + " is the sum.");
		sc.close();
	}

}
