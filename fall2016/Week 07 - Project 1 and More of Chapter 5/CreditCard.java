public class CreditCard
{
	public static void main(String[] args)
	{
		long number = 51826437;
		System.out.println("The number is: " + number);
		System.out.println("The forth number is: " + getDigit(number, 4));
		System.out.println("The length of the number is: " + getLength(number));
		System.out.println("The card is a " + prefixDigitValidation(number));
	}
	
	// Gets the digit at a certain index
	public static int getDigit(long number, int index)
	{
		int digit = 0;
		for(int i = 1; i <= index; i++)
		{
			digit = (int)(number % 10);
			number = number / 10;
		}
		return digit;
	}
	
	public static String prefixDigitValidation(long number)
	{
		while(number != 0)
		{
			int digit = (int)(number % 10);	// Gets the last digit in the number
			number = number / 10;			// Chops off the last number
		
			if(number == 4)
			{
				return "Visa";
			}
			else if(number >= 51 && number <= 55)
			{
				return "Master";
			}
			else if(number == 34 || number == 37)
			{
				return "American Express";
			}
			else if(number == 6011 || (number >= 622126 && number <= 622925) || (number >= 644 && number <= 649) || number == 65)
			{
				return "Discover";
			}
		}
		return "None of the cards are valid";
    }
	
	public static int getLength(long number)
	{
		int count = 0;
		while(number != 0)
		{
			int digit = (int)(number % 10);	// Gets the last digit in the number
			number = number / 100;			// Chops off the last number
			count++;
		}
		return count;
	}
	
	public static boolean LengthValidation(long number)
	{
		int total = getLength(number);
		if(total >= 13 && total <= 19)
		{
			return true;
		}
		return false;
	}
}