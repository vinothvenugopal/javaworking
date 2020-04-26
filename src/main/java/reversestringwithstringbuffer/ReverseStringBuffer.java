package reversestringwithstringbuffer;

import java.util.Scanner;

import org.testng.annotations.Test;

public class ReverseStringBuffer {
	@Test
	public void reverseString() {
		
		/*
		 * System.out.println("Enter the string to be reversed"); Scanner scan = new
		 * Scanner(System.in); StringBuffer input = new StringBuffer(scan.nextLine());
		 */
		StringBuffer input = new StringBuffer("Vinoth");
		System.out.println(input.reverse());
	}
}
