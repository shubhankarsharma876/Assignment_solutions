//Take 2 numbers as input and print the largest number.
package firstJava;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a = sc.nextInt();
		System.out.print("Enter the second number: ");
		int b = sc.nextInt();
		 int res = greater(a,b);
		 System.out.print(res);
		 sc.close();
	}
	static int greater(int x , int y) {
		int result= y;
		if(x>y) {
			result = x;
		}
		return result;
	}

}
