import java.util.*;

public class Activity4_3 {
	/**T
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LinkedList<Integer> userNums = new LinkedList<Integer>();
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter 3 non negative integers.");
		
		for(int x = 1; x < 4; x++ ){
			System.out.print("Enter Integer " + x + ": ");
			userNums.add(Integer.parseInt(userInput.next()));
		}
		Collections.sort(userNums);
		
		System.out.print("The numbers in increasing order are: ");
		for (int i : userNums){
			System.out.print(i + " ");
		}
		
	}
}