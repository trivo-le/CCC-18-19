import java.util.Scanner;

public class Flipper {

	public static void main(String[] args) {
	/* Tri Vo-Le
	 * January 26, 2021
	 * PURPOSE:
	 */

	Scanner input = new Scanner(System.in);	
		
	//Prompt for a combination of Horizontal and Vertical flips
	System.out.println("Please input a possible combination of Horizontal (H) and Vertical (V) flips.");
	String flipCombo = input.next();
	
	// If the length of the combination is invalid
	while (flipCombo.length()<1 || flipCombo.length()>1000000) {
		
	System.out.println("The length of the combination should only be between 1 and 1 000 000 characters.");	
	System.out.println("Please input a VALID combination.");
	flipCombo = input.next();	
		}//while
	
	
	int hOccurence = 0, vOccurence = 0;
	
	// Go through each character of the string and count the number of Horizontal and Vertical flips respectively
	for (int index = 0; index<flipCombo.length(); index++) {
		
		switch (flipCombo.charAt(index)) {
		
		case 'H':
			hOccurence++;
			break;
			
		case 'V':
			vOccurence++;
			break;
			}//switch
	}//for

	//If there is an even number of horizontal flips
		
		//Even number of vertical flips as well, grid remains unchanged
	if (hOccurence%2==0 && vOccurence%2==0) {

		System.out.printf("1 2%n3 4");
		}//if
	
		//Odd number of vertical flips, grid flips across its vertical axis
	else if (hOccurence%2==0 && vOccurence!=0) {
		
		System.out.printf("2 1%n4 3");
		}//else if
	
	//If there is an odd number of horizontal flips
	
		//Even number of vertical flips, the grid flips across its horizontal axis
	else if (hOccurence%2!=0 && vOccurence%2==0) {
		
		System.out.printf("3 4%n1 2");
		}//else if
	
		//Odd number of vertical flips as well, grid flips on both of its axis.
	else if (hOccurence%2!=0 && vOccurence%2!=0) {
		
		System.out.printf("4 3%n2 1");
		}//else if
	
	input.close();
	}//main

}//Flipper
