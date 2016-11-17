/* This program reads a file containing city names and zipcode, 
then generate a file which contains the barcode associated with each zipcode.
Also this program reads a file containing the barcodes and the 
create back the zipcodes associated with each barcode. zipcodes.txt is the input file that 
your program reads, then your program generates the bars.txt and zips.txt */
import java.io.*;
import java.util.*;
public class ZipcodeDriver
{
	public static void main(String[] args) throws FileNotFoundException
	{
		ZipCode.initializeTable();
		//Scanner input = getInputFile();
		Scanner kb = new Scanner(System.in);
		
		PrintStream out = getOutputFile(kb, "Enter the file name that you want to store the barcodes");
		Scanner input = getInputFile(kb, "Enter the file name that contains the zip codes:");
		processZipCodes(input, out);
		
		input = getInputFile(kb, "Enter the file name that contains the barcodes:");
		out = getOutputFile(kb, "Enter the file name that you want to store the zipcodes");
		processBarCodes(input, out);
	}
	
	/*this method gets the output file name so that we output the result in this file*/
	public static PrintStream getOutputFile(Scanner kb, String s)   
	{
		return null;
	} 
	/*This method gets the name of the input file. It should keep asking the user until you get a valid file name */  
	public static Scanner getInputFile(Scanner kb, String s)  throws FileNotFoundException
	{
		return null;
	}     
	
	/*This methods reads the information from the given input file
	there are two tokens on each line. A whole line is needed to be 
	read from the file. Then a Scanner object needs to be created for the line that we just read. 
	once we have the Scanner object for the line we can read the first token which is the zipcode.
	Create an object of the ZipCode class and call the appropriate methods from the ZipCode class
	output the result in the output file*/
	public static void processZipCodes(Scanner input,  PrintStream output)
	{
		// Keep processing zip codes until we reach the end of the file
		// Hint: use a loop to accomplish this
		// For each line:
			// 1. Store the next zip code of the file using the input scanner in a string variable.
			// 2. Make a new scanner that reads in that string variable.
			// 3. Get the value of the zip code and store it in an int.
			// 4. Get the next line and store it as the name.
			// 5. Create a new zip code using the value gotten in step 3
			// 6. Get the barcode of the zip by running barCode(). Store it in a string variable.
			// 7. Save the barcode to the output file by printing to it using output.print().
	}
	
	/*This method gets the input file which conatins the bar codes and the city names. 
	as long as there are more lines in the file, read one line, cretae a Scanner object for the line
	use the methods from the Scanner class to read one token at a time. The first token on 
	each line is the barcode, call the right methods to convert the barcode back to the zipcode form.
	and output the result in the output file*/
	public static void processBarCodes(Scanner in, PrintStream out)
	{
		// Keep processing zip codes until we reach the end of the file
		// Hint: use a loop to accomplish this
		// For each line:
			// 1. Store the next zip code of the file using the input scanner in a string variable.
			// 2. Make a new scanner that reads in that string variable.
			// 3. Get the value of the barcode and store it in a string.
			// 4. Convert the barcode using the static method, Zipcode.convertBarCode()
			// 5. Trim the name using the trim() method.
			// 6. Save the barcode to the file using out.print(). Formate the barcode accordingly.
	}
}