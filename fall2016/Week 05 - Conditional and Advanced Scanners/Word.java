public class Word
{
	public static void main(String[] args)
	{
		String word = reverse("Hello Java!");
		System.out.println(word);
	}
	
	public static String reverse(String s)
	{
		String answer = "";
		// Starting with the last letter
		for(int i = s.length()-1; i >= 0; i--)
		{
			// Go through each letter.
			// charAt outputs a char we use
			// the following to convert it
			// back to a string.
			// ----------------------------
			//					   |   |
			//					   |   |
			//					   |   |
			//					  \|/ \|/
			//					   V   V
			String c = s.charAt(i) +  "";
			// Capitilize it
			// Add the letter to the string
			answer = answer + c.toUpperCase();
		}
		// Return the string
		return answer;
	}
}