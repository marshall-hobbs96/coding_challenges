package february_week_two_coding_challenges;

import java.util.ArrayList;

public class Challenges {

	
	//Coding Challenge 1: Write a function that returns true if a string consisting of ascending numbers or ascending numbers and consecutive numbers
	
	public static boolean ascending(String str) {
		
		int previousNumber = Integer.parseInt(str.substring(0, 1));
		boolean isAscending = true; 
		
		for(int i = 0; i < str.length(); i++) {
			
			int currentNumber = Integer.parseInt(str.substring(i, i+1));
			
			if(currentNumber < previousNumber) {
				
				System.out.print(currentNumber);
				isAscending = false;
				break;
				
			}
			
			previousNumber = currentNumber; 
			
		}
		
		return isAscending; 
		
	}
	
	//Coding challenge 2: create a function that takes an integer and outputs an n x n square soley consisting of the integer n
	
	public static ArrayList[] squarePatch(int n) {
		
		ArrayList[] returnArray = new ArrayList[n]; 
		
		for(int i = 0; i < n; i++) {
			
			returnArray[i] = new ArrayList<>(); 
			
			for(int j = 0; j < n; j++) {
				
				returnArray[i].add(new Integer(n));				
				
			}		
			
		}
		
		return returnArray; 
		
	}
	                         
	
}
