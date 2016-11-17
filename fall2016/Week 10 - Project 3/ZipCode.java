import java.util.*;
public class ZipCode
{
	// Instance variables
	private int zip;
	// The encoding table and weight are static because they are the same across instances,
	// meaning that each object has the same encodingTable and weight.
	private static int[][] encodingTable;
	private static int[] weight;          
	
	/* 
	  Constructor. Run when you have new ZipCode()
	  This is the method that will run when you create a new ZipCode object in your driver.
	*/
	public ZipCode(int z)
	{
		// Assign the private zip code to the value of the zip code that is being passed in.
		zip = z;
	}
	
	/*
		We need to initialize the array encoding table to the proper values.
		Also initialize the array weight to the provided weight values.
	*/
	public static void initializeTable()
	{
		// Create a 2d array to hold the values of each number. This is the encondingTable instance variable
		// Then create another array containing the values of the weights.
		/*
				 { 7   4   2   1   0 } <--- Declare an integer array containing the weights
Row Index ---> 0 { 0   0   0   0   0 } <--- Dummy values for index 0. We want to match the digit with the index. 
			   1 { 0   0   0   1   1 } <--- { Column }
			   2 { 0   0   1   0   1 }
			   3 { 0   0   1   1   0 }
			   4 { 0   1   0   0   1 }
			   5 { 0   1   0   1   0 }
			   6 { 0   1   1   0   0 }
			   7 { 1   0   0   0   1 }
			   8 { 1   0   0   1   0 }
			   9 { 1   0   1   0   0 }
			  10 { 1   1   0   0   0 } <--- Special case: If the barcode is = 11, then the digit is 0.
		*/
		
		int[] weight            = { 7, 4, 2, 1, 0 };
		int[ ][ ] encodingTable = { 
									{0, 0, 0, 1, 1},
								    {0, 0, 1, 0, 1},
								    {0, 0, 1, 1, 0}
								  };
		//  y  x
		
	}
   
	/* Calculates the sum of the digits in the zipcode and returns the sum */
	private int sumDigits()
	{
		// 1. Declare an integer sum to store the sum of the zipcode
		// 2. Iterate (go through) each of the digits in the zipcode.
		// 3. Get the current number and add it to the sum.
		//    Note: Since the zip code is an integer, you need to use modulus to get each number.
		// 4. After the loop is over, return the sum
		return 0;
	}

	/* Calculates the check digit and returns it. This method uses the method sumDigits */
	private int checkDigit()
	{
		// After getting the sumDigits of the zip code,
		// we need to calculate a check digit that gives us a multiple of 10.
		// For example: zip = 95762.
		// - sumDigits(95762) returns a sum of 29.
		// - We need 29 to be a multiple of 10.
		// - We ask the question, "How many digits do we need to get from 29 to 30?"
		// - The answer is 1. To make the sum, 29, a multiple of 10, which is 30, we need 10 add 1 to the sum.
		// - Therefore, the checkDigit for 95762 is 1.
		// 
		// In order to make the computer do this, we need to:
		// 1. Mod the sum by 10 to get the remainder of the sum
		// 2. Subtract that remainder from 10 to get the number of digits away from 10. This will give us the checkDigit
		// 
		// Example: 95762
		// 1. sumDigits(95762) -> 9+5+7+6+2 = 29
		// 2. 29 % 10 = 9 <--- Remainder of sumDigits
		// 3. 10 - 9 = 1  <--- checkDigit
		// 4. Special Case: if the checkDigit is 10, in the case that the remainder is 0. Return 0.
		// 5. Else, return checkDigit
		return 0;
	}
   
	/*
		Sets a new value for the zip code.
		The value of integer c passed in by the user will be the new value of the zip for the instance
	*/
	
	public void setCode(int c)
	{
	}
	
	/* Returns the value for the zip code */
	public  int getCode()
	{
		return zip;
	} 
   
	/* Creates the bar code for the given zip code */  
	public String barCode()
	{
	// In order to convert a zip code to a bar code,
	// we need to use the encodingTable to see what
	// numbers have which bar codes.

	// For example, zipcode 95762
	// From the encodingTable:
	// 9 ---> 10100
	// 5 ---> 01010
	// 7 ---> 10001
	// 6 ---> 01100
	// 2 ---> 00101
	// 95762 -> 1010001010100010110000101
	//          |___||___||___||___||___|
	//            9    5    7    6    2
	// We then need to convert those 1's and 0's to | and : respectively:
	// So 1 -> |
	//    0 -> :
	// Therefore, 1010001010100010110000101
	// becomes:   |:|:::|:|:|:::|:||::::|:|
	// We then return the resulting barcode

	// Pseudo code
	// 1. Go through each number and use the 2d array to get the value for each digit:
	// 		1a. First, iterate through the zip to get each number
	// 		1b. Create an inner loop that gets each number from the chosen digit
	// 2. After converting each digit to 1's and 0's, append those numbers to a string
	// 3. Iterate through each digit in the string of 1's and 0's.
	// 		3a. Use a conditional statement to check if the charAt() is a '|' or a ":".
	//      	if it's a '|' then append a 1, else append a ':' to the string
	// Return the string containing 
	return "";
	}
		
	/* Creates one string representing the zip code */
	public String toString()
	{
		// 1. Create a String variable, result, that will store the digits of the zip.
		// 2. Go through each of the numbers in the zip and append them to the result.
		// 3. Return the resulting string.
		return "";
	}
	
	/* Converts back the bar code to the original zip code and returns it as a string, This method uses inToString method */
	public static String convertBarCode(String b)
	{
		// We need to convert a bar code back into a zipcode. We need to do the reverse of barCode().
		// 1. Create a string to store the numbers
		// 2. Iterate through each character in the barcode
		// 3. Use a conditional statement to check if the char is a | or a :
		// 		3a. If it's a |, append a 1 to the string from step 1.
		//		3b. Else, append a 0 to the string from step 1.
		// 4. Create a 6 digit array to store each digit representing the zip code, and the weight of that digit
		// 5. Loop through the string made in step 1.
		// 6. For each 5 characters, parse the digits made in step 4 and add them up:
		// 		6a. Use Integer.parseInt() to convert the char from the string in step 1
		//		6b. Multiply that number by the weight of the digit.
		//		6c. Add the sum of that result to a total sum.
		// 7. Special Case: Check if the total sum is 11. If so, set it to 0. (See initializeTable() for details)
		// 8. Otherwise, store the total sum in the 6 digit array. The total sum should be each digit of the zip
		// 9. Convert the zip array to a string, using intToString()
		return "";
	}
	
	/* Returns the elements of the array as a single String */
	private static String intToString(int[] a)
	{
		// Create a String to store the result.
		// Iterate through the int array.
		// Append each int to the resulting string.
		// Return the resulting string.
		return "";
	}                
}