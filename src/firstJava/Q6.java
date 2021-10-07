//Input currency in rupees and output in USD.
package firstJava;
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the currency in rupees: ");
		float rupees = sc.nextFloat();
		convert(rupees);
		sc.close();
	}
	static void convert(float a) {
		float dollar = 75*a;
		System.out.print("In USD: "+ dollar);
	}

}
