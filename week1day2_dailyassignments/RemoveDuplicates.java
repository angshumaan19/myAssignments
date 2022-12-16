package week1day2_dailyassignments;

public class RemoveDuplicates {
	public static void main(String[] args) {

		String sentence = "We learn java basics as part of Java sessions sessions in java week1";
		String[]str = sentence.split(" ");
		System.out.println(sentence);
		for (int i = 0; i < str.length; i++) {
			for (int j = i+1; j < str.length; j++) {
				if (str[i].equalsIgnoreCase(str[j])) {
					int count=0;
					count++;
					str[j] = " ";
					//System.out.println("String without duplicates: ");
					//for (int i = 0; i< str.length; i++) {
						System.out.print(str[i] +" " );
				}
		        	}
			
		}
	}	
	}
	
	