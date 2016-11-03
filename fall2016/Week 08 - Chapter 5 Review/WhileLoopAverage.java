import java.util.Scanner;


// Write a method that asks for numbers from a user until they type -1.
// Then get the average of those numbers 
public class WhileLoopAverage {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        
        // Keep asking for numbers so long as input is not equal to "exit"
        int i = 1;
        while(number != -1)
        {
            System.out.print("Number " + i + ": ");
            // Get the input from the kb and store it in a variable
            number = input.nextInt();
            
            // If the input is not exit, calculate the number
            if(number != -1)
            {
                sum = sum + number;
				// Go to the next number
            	i++;
            }
        }
        // Now that the while loop is all done, print the average
  		double average = sum/(i-1);      
		System.out.println("Sum: " + average);
	}
}