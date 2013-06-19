import java.util.Scanner;

public class Problem2 {

	/*
	 * 2. Given 2 arrays of ints, a and b, return true if they have the same
	 * first element or they have the same last element. Both arrays will be
	 * length 1 or more. commonEnd({1, 2, 3}, {7, 3}) → true commonEnd({1, 2,
	 * 3}, {7, 3, 2}) → false commonEnd({1, 2, 3}, {1, 3}) → true
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter list of numbers for first array:");
		int a[] = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = input.nextInt();
		}
		System.out.println("Enter list of numbers for second array:");
		int b[] = new int[5];
		for (int i = 0; i < b.length; i++) {
			b[i] = input.nextInt();
		}
		if (a.length > 1 && b.length > 1 && a[0] == b[0] || a[4] == b[4]) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
