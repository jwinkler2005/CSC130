import java.util.*;

public class Activity4_3_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// My list I will use to store my sorted integers
		LinkedList<Integer> userNums = new LinkedList<Integer>();
		//integers from the user
		int one, two, three;
		Scanner userInput = new Scanner(System.in);
		
		// Ask the user to input 3 different non negative integers and
		// store them in 3 separate variables
		System.out.println("Please enter 3 non negative integers.");
		System.out.print("Integer 1: ");
		one = userInput.nextInt();
		
		System.out.print("Integer 2: ");
		two = userInput.nextInt();
		
		System.out.print("Integer 3: ");
		three = userInput.nextInt();
		
		
		/* I use this algorithm to compare each of the variable from received
		* from the user's input.
		* It compares each variable and adds them into the list once it 
		* determines which variable is the smallest. I chose to compare it 
		* this way so I would get a list of increasing order.
		*/
		if(one < two){
			if(one < three){
				userNums.add(one);
				if(two < three){
					userNums.add(two);
					userNums.add(three);
				}
				else{
					userNums.add(three);
					userNums.add(two);
				}
			}
			else{
				userNums.add(three);
				userNums.add(one);
				userNums.add(two);
			}
			
		}
		else if(two < three){
			userNums.add(two);
			if(one < three){
				userNums.add(one);
				userNums.add(three);
			}
			else{
				userNums.add(three);
				userNums.add(one);
			}
		}
		else{
			userNums.add(three);
			userNums.add(two);
			userNums.add(one);
		}
		
		// I use a for loop to iterate through the list and print it to 
		// the users console.
		System.out.print("The numbers in increasing order are: ");
		for (int i : userNums){
			System.out.print(i + " ");
		}
	}
}

