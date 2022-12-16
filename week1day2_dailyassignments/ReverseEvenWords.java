package week1day2_dailyassignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] splinwords = test.split(" ");
		for (int i = 0; i < splinwords.length; i++) {
			//System.out.println(splinwords[i]);
			
			if(i % 2 != 0)
				System.out.println(i);
			if(i % 2 != 0)
			System.out.println(splinwords[i]);
				
				for (int j = i-1; j >= 0; j--) {
					System.out.print(splinwords[j]); //stuck in this step
					
				}
			}
			
			
		}
		
		
	
	
}

