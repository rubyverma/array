import java.util.Scanner;

public class Problem1 {

	/*
	 * 1. Given an array of ints, return true if the array is length 1 or more,
	 * and the first element and the last element are equal.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the list of numbers: ");
		int list[] = new int[5];
		for (int i = 0; i < list.length; i++) {
			list[i] = input.nextInt();
		}
		if (list.length >= 1 && list[0] == list[4]) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
