class ArrayTest {
    public static void main(String[] args) {
        int[ ][ ] encodingTable = {
                                    {1, 2, 3, 4, 5},
                                    {6, 7, 8, 9, 10},
                                    {11, 12, 13, 14, 15}
                                  };
        // System.out.println(encodingTable[1][3]);
        
        for (int i = 0; i <= encodingTable[1].length - 1; i++) {
            System.out.print(encodingTable[1][i] + " ");
        }
        
    }
}