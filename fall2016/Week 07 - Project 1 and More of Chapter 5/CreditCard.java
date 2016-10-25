public class Test
{
	public static void main(String[] args)
	{
		long number = 51826437;
		System.out.println("The number is: " + number);
		System.out.println("The forth number is: " + getDigit(number, 4));
		System.out.println("The length of the number is: " + getLength(number));
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
	
	public static int getLength(long number)
	{
		int count = 0;
		while(number != 0)
		{
			int digit = (int)(number % 10);	// Gets the last digit in the number
			number = number / 10;			// Chops off the last number
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