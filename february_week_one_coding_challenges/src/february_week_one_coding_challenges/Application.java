package february_week_one_coding_challenges;

import java.util.ArrayList;

public class Application {

	public static <E> void main(String[] args) {
		
		
		ArrayList<Object> arrayToTest = new ArrayList<>(); 
		
		arrayToTest.add("Hello");
		arrayToTest.add("World");
		arrayToTest.add(1);
		arrayToTest.add(23);
		
		ArrayList<Object> filteredArray = (ArrayList<Object>) Challenges.filterArray(arrayToTest);
		System.out.println(filteredArray);
		
		

	}

}
