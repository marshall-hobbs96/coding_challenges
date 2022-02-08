package february_week_two_coding_challenges;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		
		
		System.out.println("Should be TRUE: " + Challenges.ascending("12345678"));
		System.out.println("Should be TRUE: " + Challenges.ascending("1222222333344444556"));
		System.out.println("Should be FALSE: " + Challenges.ascending("1112222333444111"));
		
		ArrayList[] arrayToPrint = Challenges.squarePatch(5);
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 5; j++) {
				
				System.out.print(arrayToPrint[i].get(j));
				
			}
			
			System.out.println(); 
			
		}
		
		
		
		

	}

}
