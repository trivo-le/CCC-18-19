import java.util.Scanner;

public class Sunflowers {
	
	public static void main(String[] args) {
	/* Tri Vo-Le
	 * February 2, 2021
	 * Fix Barbara's table of data on her sunflowers' growth by rotating it the proper way so that the shortest 
	 * sunflower is displayed in the first row
	 */
	
	Scanner input = new Scanner(System.in);
	
	// Get the number of sunflowers per row, N
	int N = input.nextInt();
	
	int[][]growth = new int[N][N];
	
	//Assigning values from keyboard
	for (int row = 0;row < growth.length; row++){

		for (int col = 0;col < growth[row].length; col++){

			growth[row][col] = input.nextInt();
			}//for col 

		} //for row
	
	// Display the corrected version of Barbara's table of data. 
	rotate(growth);
	
	input.close();
	}//main
	
	
	
	public static int smallest(int[][]twoD) {
	// Return the smallest element in a one dimensional integer array passed in the parameter
	
	int smallest = twoD[0][0];
	
	for (int row = 0; row < twoD.length; row++) {
		
		for (int col = 0; col < twoD.length; col++) {
			
			if (smallest > twoD[row][col]) {
				
				smallest = twoD[row][col];
				
			}//if
			
		}//for
	
	}//for
	
	return smallest;
	}//smallestLocation
	
	
	
	public static void rotate (int[][]twoD) {
	// Rotate the elements in a two dimensional array passed to the parameter so that the smallest element is first
	
	int[][]rotate = new int[twoD.length][twoD.length];	
		
	int smallest1 = smallest(twoD);
	
	/*If the element in the first row and column is NOT the smallest element in the original twoD array,
	  then the loop executes until the first element IS the smallest.*/ 
	while (rotate[0][0]!=smallest1) {
	
		//Rotating the array 90º clockwise
		for (int col = 0, rRow = 0; col < rotate.length; col++, rRow++) {
			
			for (int row = rotate.length-1, rCol = 0; rCol < rotate.length; row--, rCol++) {
		
				rotate[rRow][rCol] = twoD[row][col];
			
			}//for
		
		}//for
	
		//Update all elements of the twoD, which is in the parameter, to match the elements of the rotated array
		for (int row = 0; row < twoD.length; row++) {
		
			for (int col = 0; col < twoD.length; col++) {
				
				twoD[row][col] = rotate[row][col];
	
			}//for
			
		}//for

	}//while
		
	// Print the final array in its correct order
	printArray(rotate);
	}//rotate
	
	
	
	public static void printArray (int[][]twoD) {
	// Print the elements of the two dimensional integer array passed through the parameter
		
	for (int row = 0;row<twoD.length; row++){

		for (int col = 0;col<twoD[row].length; col++){

			System.out.print(twoD[row][col] +" ");
			}//for col

		System.out.println();

		} //for row
	
	}//printArray
		
}//Sunflowers
