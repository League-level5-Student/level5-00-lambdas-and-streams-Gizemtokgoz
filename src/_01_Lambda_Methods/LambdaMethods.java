package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			StringBuilder stringBuilder = new StringBuilder(s);
			String reversedString = stringBuilder.reverse().toString();
			System.out.println(reversedString);
		}, "repeat");
		
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			char[] stringArray = s.toCharArray();
			String newString = "";
			for(int i = 0; i < stringArray.length; i++) {
				if (i % 2 == 0) {
					newString += Character.toUpperCase(stringArray[i]);
				} else {
					newString += Character.toLowerCase(stringArray[i]);
				}
			}
			System.out.println(newString);
		}, "repeat");
		
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			char[] stringArray = s.toCharArray();
			String newString = "";
			for(int i = 0; i < s.length(); i++) {
				newString += stringArray[i] + ".";
			}
			System.out.println(newString);
		}, "repeat");
		
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			char[] stringArray = s.toCharArray();
			String newString = "";
			for(int i = 0; i < stringArray.length; i++) {
				if (stringArray[i] != 'a' && stringArray[i] != 'e' &&  stringArray[i] != 'i' &&  stringArray[i] != 'o' && stringArray[i] != 'u') {
					newString += stringArray[i];
				}
			}
			System.out.println(newString);
		}, "repeat");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
