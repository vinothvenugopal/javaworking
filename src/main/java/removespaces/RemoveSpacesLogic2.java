package removespaces;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveSpacesLogic2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		char[] charArray = input.toCharArray();
		String output = "";
		for (int i = 0; i < charArray.length; i++) 
		{
			if((charArray[i] != ' ') && (charArray[i] != '\t'))
			{
				output = output+charArray[i];
			}
		}
		System.out.println(output);
	}

}
