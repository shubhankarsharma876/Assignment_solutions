//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
package firstJava;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter principal:");
		float p = sc.nextFloat();
		System.out.print("Enter time:");
		float t = sc.nextFloat();
		System.out.print("Enter Rate:");
		float r = sc.nextFloat();
		sc.close();
		SI(p,r,t);
	}
	static void SI(float pr,float ra,float ti) {
		float result = (pr*ra*ti)/100;
		System.out.print(result+" is the simple interest.");
	}

}
