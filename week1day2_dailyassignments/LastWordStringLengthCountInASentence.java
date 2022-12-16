package week1day2_dailyassignments;

public class LastWordStringLengthCountInASentence {

public static void main(String[] args) {
	String name = "Amazon development center";
String lowerCase = name.toLowerCase();
//System.out.println(lowerCase);

String[] word = lowerCase.split(" ");
for (int i = word.length-1; i >=word.length-1; i--) {
	System.out.println(word[word.length-1]);
	String words1 = word[word.length-1];
	System.out.println(words1.length());
}
	}
}


	


