/**
 * Construct a class named Flag that produces the following pattern for any
 * size between 1 and 10. Create a constant, SIZE to change the size desired.
 * Sizes 3, 5 and 7 are shown below for reference:
 * 
 *      SIZE 3:     SIZE 5:         SIZE 7: 
 *      ------      ----------      --------------
 *      ----        --------        ------------
 *      --          ------          ----------
 *      |           ----            --------
 *      |           --              ------
 *      |           |               ----
 *                  |               --
 *                  |               |
 *                  |               |
 *                  |               |
 *                                  |
 *                                  |
 *                                  |
 *                                  |
 */                                 
public class Flag {    
    public static final int SIZE = 3;
    
    public static void main(String[] args) {
        // From lines SIZE through 1, subtracting by two
        for(int line = 1; line <= SIZE; line++)
        {
            // Print out each dash, from 1 to line
            for(int dash = 1; dash <= (SIZE*2)-(line-1)*2; dash++)
            {
                System.out.print("-");
            }
            System.out.println();
        }
        for(int line = 1; line <= SIZE; line++)
        {
            System.out.println("|");
        }
    }
}