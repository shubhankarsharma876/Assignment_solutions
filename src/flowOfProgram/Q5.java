//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
package flowOfProgram;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of elements: ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		System.out.print("Enter the elements in the element: ");
		for(int i=0;i<num;i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		
		for(int i =0;i<num;i++) {
			sum+=arr[i];
		}
		System.out.print(sum);
		sc.close();
	}

}
