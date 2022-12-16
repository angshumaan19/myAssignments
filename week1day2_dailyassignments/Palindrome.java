package week1day2_dailyassignments;

public class Palindrome {

	public static void main(String[] args) {
		String reversename = "";
		String name = "madam";
		//name = name.toLowerCase();
		char[] charArray = name.toCharArray();
		for (int i = charArray.length-1; i >= 0; i--) {
			//System.out.println(charArray[i]);

			
			reversename = reversename + charArray[i];
		}
			if (name.equals(reversename)) {
				System.out.println("this is a palindrom" );
			}
			else {
				System.out.println("this is not a palindrom");
			}
		}
	}