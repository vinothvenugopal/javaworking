package dailyjavarevisits;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String input;
		System.out.println("Enter the string to be reversed");
		Scanner scan = new Scanner(System.in);
		input = scan.nextLine();
		char[] charArray = input.toCharArray();
		for (int i = charArray.length-1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
	}
}
