

public class CreditCardShell
{
   /*prompt the user to get the credit card number
    call the method isvalid, this is the only method call that you can have in the main method
    output the result*/

   public static void main(String[] args)
   {
       
      
   }
   /*call the other methods to determine if the credit card number is valid or not
    methods that you need to call in here are lengthValidation, prefixDigitValidation,
    sumOfOddPlaced, sumOfDoubleEvenPlaced, isDivisibleByTen*/
   public static boolean isValid(long number)
   {
   
       return true;
   }
    /*check the number of the digits in the credit card to see if it is valid or not  */
   public static boolean LengthValidation(long number)
   {
    
       return true;
    
   }
    /*this method return true if num is divisible by ten*/
   public static boolean isDivisableByTen(int num)
   {
        
       return true;
   }  
    
    /*check the prefix digits to see if they are  valid , refer to the provided table*/
   public static boolean prefixDigitValidation(long number )
   {
        
       return true;
   }
    /*calculates the sum of odd placed digits*/
   public static  int sumOfOddPlaced(long number)
   {
       
      return 0;
      
   }
    /*calculate the sum of the double even palced digit. refer to the Mod 10 algorithm
    need to call the method isDoubleDigit in here*/

   public  static int sumOfDoubleEvenPlaced(long number)
   {
             return 0;
   }
    /*if the parameter to this method is a two-digit number then this method needs to return the sum of the digits,
    or example if this method gets the value 34, then it return 3 + 4 which is 7
    if it gets the value 7 then it should return 7 since it is a single digit*/

   public  static int isDoubleDigit(int number)
   {
          return 0;
   }
   /*describe what the program does. include your name as well*/ 
   public static void description()
   {
   }
    
 }   
        
       