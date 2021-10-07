//Write a program to print whether a number is even or odd, also take input.
package firstJava;
import java.util.Scanner;
public class Q1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int num = sc.nextInt();
	check(num);
	sc.close();
	}
	
	static void check(int n) {
		if(n%2==0) {
			System.out.print("The number is even");
		}else {
			System.out.print("The number is odd");
		}

	}
}
