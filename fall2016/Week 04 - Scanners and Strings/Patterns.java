public class Pattern {
    public static void main(String[] args)
    {
        split(5, "12345678912345689");
    }
    
    public String split(int n, String s) {
        // Break up string into substrings of size n
            // Starting Index
            // Ending Index
        //s.substring(0, 4+1);
        //s.substring(5, 9+1);
        
        int patternTotal = s.length()/n;
        for(int i = 1; i <= patternTotal; i++) {
            // The expressions that go inside of our for loop
            s.substring(start+n, end+n);
        }
    }
}