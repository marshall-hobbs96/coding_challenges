package february_week_one_coding_challenges;

import java.util.ArrayList;
import java.util.List;

public class Challenges {
	
	public static <E> List<E> filterArray(List<E> arrayToFilter) {	//method for coding challenge number one. Filter array so only ints remain. Maintain order
			
		ArrayList<E> filteredArray = new ArrayList<>(); 
		
		for (E e : arrayToFilter) {
			
			if(Integer.class == e.getClass()) {
				
				filteredArray.add(e);
				
			}
			
		}
		
		return filteredArray; 
		
	}
	
	public static String multiplyBy11(String base) {	//method for coding challenge number two. Multiply input string (which will be a string
														//representation of a number) by 11, without casting. 
		
		//I guess we can cast the individual chars though? Kinda impossible otherwise
		
		
		
		int firstNumber = Integer.parseInt(base.substring(0, 1));
		int lastNumber = Integer.parseInt(base.substring(base.length() - 2, base.length() - 1));
		
		int sum = firstNumber + lastNumber; 
		
		if(sum > 9) {
		
			
			
		}
		
		else {
			
			
			
		}
		
		return ""; //stub
		
	}
	

}
