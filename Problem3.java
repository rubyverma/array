import java.util.Scanner;

public class Problem3 {

	/*
	 * 3. Given an array of ints length 3, return a new array with the elements
	 * in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an array of three elements:");
		int list[] = new int[3];
		for (int i = 0; i < list.length; i++) {
			list[i] = input.nextInt();
		}
		for (int i = 2; i >= 0; i--) {
			System.out.print(list[i] + " " + " ");
		}

	}

}
