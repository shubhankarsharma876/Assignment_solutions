//Take a number as input and print the multiplication table for it.
package flowOfProgram;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		for(int i=1;i<=10;i++) {
			int result=i*num;
			System.out.print(num+"*");
			System.out.print(i);
			System.out.print("="+result);
			System.out.println();
		}
		sc.close();
	}

}
