public class SpiralMatrix {
    // Spiral Mtrix Logic
    public static void spiralMatrix(int matrix[][]) {
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = matrix.length - 1;
        int colEnd = matrix[0].length - 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            // print upper boundary --> row remains constant and column changes
            for (int i = colStart; i <= colEnd; i++) {
                System.out.print(matrix[rowStart][i] + " ");
            }
            rowStart++; //update rowStart --> not to print it again 
            System.out.println();
            // print right boundry --> row number changes and column remains constant
            for (int i = rowStart; i <= rowEnd; i++) {
                System.out.print(matrix[i][colEnd] + " ");
            }
            colEnd--;   //update colEnd
            System.out.println();
            // print bottom boundary --> row remains constant and column changes
            for (int i = colEnd; i >= colStart; i--) {
                System.out.print(matrix[rowEnd][i] + " ");
            }
            rowEnd--;   //update rowEnd 
            System.out.println();
            // print left boundary --> column remains constant but row number changes
            for (int i = rowEnd; i >= rowStart; i--) {
                System.out.print(matrix[i][colStart] + " ");
            }
            colStart++; //Update colStart
            System.out.println();
        }
    }

    public static void main(String args[]) {
        System.out.println("Spiral Matrix:");
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        spiralMatrix(matrix); // Output should be --> 1-2-3-6-9-8-7-4-5-6

    }
}
