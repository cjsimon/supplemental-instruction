// Eric Klenner
// CSC15 – Professor Farough 
// Project #3


import java.util.*;
public class CreditCard {
   public static void main(String[] args) {
      boolean valid;
      String s = "y";
      Scanner console = new Scanner(System.in);
      //prompt the user to get the credit card number
      System.out.println("This program will determine if you");
      System.out.println("have entered a valid credit card number");
     
      while (s.equalsIgnoreCase("y")) {
      
         System.out.print("Enter a credit card number: ");
         long number = console.nextLong();
      
         valid = isValid(number);
      
      
         //output the result 
         if (valid) {
            System.out.println("This is a valid credit card number");
         } else {
            System.out.println("This is not a valid credit card number");
         } 
         System.out.print("Would you like to validate another credit card? y/n ");
         s = console.next();
         if (s.equalsIgnoreCase("n")) {
            System.out.print("Have a nice day!");
         }        
      }
   }     
 
   public static boolean isValid(long number) {
      int sum = 0;
      boolean valid;
      // call the other methods to determine if the credit card number is valid or 
      //not
 
 
      //methods that you need to call in here are lengthValidation, 
      valid = lengthValidation(number);
      if (!valid) {
         return valid;
      }    
      //prefixDigitValidation,
      valid = prefixDigitValidation(number);
      if (!valid) {
         return valid;
      }   
      // sumOfOddPlaced,
      sum += sumOfOddPlaced(number); 
      //sumOfDoubleEvenPlaced,
      sum += sumOfEvenPlaced(number);
      //isDivisibleByTen
      if (sum % 10 == 0) { 
         return true;
      } else {
         return false;
      }
   }
      
   public static boolean lengthValidation(long number) {
   
   //check the number of the digits in the credit card it must be 13 or 16    
   //digits
   
      int count = 0;
      while (number > 0) {
         number /= 10;
         count++;
      }
      if (count == 13 || count == 16 || count ==15) {
         return true;
      } else {
         System.out.println("The number entered is not 13 or 16 numbers long.");
         return false;
      }      
 
   }
 
   public boolean isDivisableByTen(int num) {
   //this method return true if num is divisible by ten
      return true;
   } 
 
 
   public static boolean prefixDigitValidation(long number) {
   //check the prefix digits to see if they are valid, it must be 4, 5, 37 or
   //6
      while (number > 0) {
         number /= 10;
         if (number == 37 || number ==34) {
            return true;
         } else if (number >= 4 && number <= 6) {
            return true;
         }
      }   
         System.out.println("The entered number does not match any valid prefixes.");
         return false;          
   }
 
   public static int sumOfOddPlaced(long number) {
      int sum = 0;
      // calculates the sum of odd placed digits
      while (number > 0) {
         sum += number % 10;
         number /= 100;
      }    
   return sum;
   }
   
   public static int sumOfEvenPlaced(long number) {
   // calculate the sum of the double even palced digit. refer to the Mod 10 
   //algorithm
      int sum = 0;
      int tempNum = 0;
      number /= 10;
      while (number > 0) {
         tempNum = (int) (number % 10) * 2;
         if (tempNum < 10) {
            sum += tempNum;
         } else {
            sum += isDoubleDigit(tempNum);
         }
         number /= 100;
      }   
      return sum;
   }
   // makes secondary calculation if doubled digit is greater than 9
   public static int isDoubleDigit(int number) {
      number = (number / 10) + (number % 10);
      return number;
   }
}