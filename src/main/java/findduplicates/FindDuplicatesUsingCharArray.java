package findduplicates;

import java.util.Arrays;
import java.util.Collections;

public class FindDuplicatesUsingCharArray {

	public static void main(String[] args) {
		int j=0;
		String input = "Butterrr";
		char[] charArray = input.toCharArray();
		Arrays.sort(charArray);
		for (int i = 0; i < charArray.length-1; i++) 
		{
			if(charArray[i+1]==charArray[i])
			{
				System.out.println("Character "+charArray[j]+" is duplicated in the string "+input);
			}
		}
	}

}
