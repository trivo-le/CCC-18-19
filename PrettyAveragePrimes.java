import java.util.Scanner;

public class PrettyAveragePrimes {

	public static void main(String[] args) {
	/* Tri Vo-Le
	 * January 26, 2021
	 * PURPOSE:
	 */

	Scanner input = new Scanner(System.in);
	
	//What is the task about
	
	//Prompt user for number of test cases, T
	int T;
	
	do {
	//System.out.println("Please input the number of test cases.");
	//System.out.println("(If this is the second time you are seeing this, then that means you inputed an invalid number.");
	//System.out.println("Please input another number that is between 1 and 1000)");

	T = input.nextInt();
	
		}while (T<1 || T>1000);
	
	//Create an array to remember the test cases.
	int[]testCases = new int[T];
	
	for (int index = 0; index<T; index++) {
		
		//System.out.println("Please input test case #" + (index+1));
		testCases[index] = input.nextInt();
		}//for
	
	findPrimes(testCases, T);
	
	input.close();	
	}//main
	
	public static void findPrimes(int[]oneD, int integer) {
	/* Find and print the two prime numbers that the integer (that is passed to the parameter) is an average 
	 * of for each element in the one dimensional array passed to the parameter
	 */
	
	// Index through each element
	for (int index = 0; index<integer; index++) {
		
		int sum = 2*oneD[index];
		
		// Find all addend pairs thats sum is double of the integer
		for (int addend1 = 2; addend1 < sum/2; addend1++) {
		
			int addend2 = sum-addend1;
		
			boolean check = false;
			boolean check2 = false;
			
			// Determine if the first addend is prime
			for (int i = 2; i <= addend1 / 2; i++) {
				
				if (addend1 % i == 0) {
					check = true;
					break;
					}//if
				}//for
			
			// Determine if the second addend is prime
			for (int i = 2; i <= addend2 / 2; i++) {
				
				if (addend2 % i == 0) {
					check2 = true;
					break;
					}//if
				}//for

			// If both are prime, then display the pair
			if (!check && !check2) {
				System.out.println(addend1 +" "+ addend2);
				break;
				}

			}//for
		}//for
	
	}//findPrimes

}//PrettyAveragePrimes
