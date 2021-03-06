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
		String numberToInsert = "";
		
		if(base.length() == 1) {
			
			int result = Integer.parseInt(base) * 11;
			
			return String.valueOf(result);
			
		}
		
		else {
			
			for(int i = 0; i < base.length() - 1; i++) {	//got to add up the sums of all adjacent digits
				
				int sum = Integer.parseInt(base.substring(i, i+1)) + Integer.parseInt(base.substring(i+1, i+2));
				
				numberToInsert += sum; 
				
			}
			
		}
		

		return base.charAt(0) + numberToInsert + base.charAt(base.length() - 1); 
		
	}
	
	/* Answer to problem 3
	 * Pretty well known logical problem. Switch on two lights, wait a little while for the bulbs to heat up. Turn one off.
	 * One light is on, so you know which light corresponds to the switch that is turned on. 
	 * One light is off, but warm to the touch, so that one corresponds to the switch you just switched off
	 * The last one is obviously the switch you never touched
	 * 
	 * Alternative answer:
	 * Just switch the lights one at a time and note which lightbulb turns on. Nothing in the problem says I cant just check back 
	 * and forth multiple times.
	 * 
	 * Super amazing alternative answer: Why would you put the switches for lights in a place where you couldnt see what lights you are
	 * turning on? Call an electrician to rewire a new switch panel
	 *
	 * 
	 * 
	 * 
	 * 
	 * */
	

}
