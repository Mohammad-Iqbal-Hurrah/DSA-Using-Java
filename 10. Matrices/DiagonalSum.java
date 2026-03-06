public class DiagonalSum {
    public static int diagonalSum(int matrix[][]){
        //brute force approach 
        // int primaryDiagonalSum = 0;
        // int secondaryDiagonalSum = 0;
       /*for(int i =0; i<matrix.length; i++){
            for(int j =0; j<matrix[0].length;j++){
                 //primary diaginal sum calculation
                if(i == j){
                    primaryDiagonalSum += matrix[i][j];
                }
                //secondary diagonal sum calculation
                else if(i+j == matrix.length-1){
                    secondaryDiagonalSum += matrix[i][j];
                }
            }
        } 
        return primaryDiagonalSum + secondaryDiagonalSum;*/

    //    More optimized appoach
    int dSum =0;
    for(int i = 0;i<matrix.length; i++){
        dSum += matrix[i][i];
        if(i != (matrix.length-1-i)){   //if matrix has an order of odd --> 3 by 3 a11 will be added twice 
            dSum += matrix[i][matrix.length-1-i];
        }
    }
        return dSum;
    }
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                           { 5, 6, 7, 8 },
                           { 9, 10, 11, 12 },
                           { 13, 14, 15, 16 } };
        System.out.println("Diagonal Sum = "+diagonalSum(matrix)); 
    }
}
