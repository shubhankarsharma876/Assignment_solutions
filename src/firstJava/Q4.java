//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package firstJava;
import java.util.Scanner; 
public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a = sc.nextInt();
		System.out.print("Enter the second number: ");
		int b = sc.nextInt();
		System.out.print("Enter the charater: ");
		//In java there is no sc.nextChar.
		//syntax for char operators is --> sc.next().CharAt(0);
		char operator = sc.next().charAt(0);
		int res= ans(a,b,operator);
		System.out.print(res);
		sc.close();
		}
	static int ans(int x, int y, char oper) {
		int result=0;
		if(oper == '+') {
			result = x+y;
		}
		if(oper == '-') {
			result = x-y;
		}
		if(oper == '*') {
			result = x*y;
		}
		if(oper == '/') {
			if(y==0) {
				System.out.print("Invalid for division");
			}else {
				result = x/y;
			}
		}
		return result;
	}
	

}
