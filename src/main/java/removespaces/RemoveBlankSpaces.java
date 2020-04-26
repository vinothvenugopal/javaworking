package removespaces;

public class RemoveBlankSpaces {

	public static void main(String[] args) {
		String input = "Hello World";
		input = input.replaceAll("\\s", "");
		System.out.println(input);
	}

}
