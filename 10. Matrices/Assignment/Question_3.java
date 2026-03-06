/*Question 3 :Write a program to Find Transpose of a Matrix.
What is Transpose?
Transpose of a matrix is the process of swapping the rows to columns. For a 2x3 matrix,
Matrix
a11    a12    a13
a21    a22    a23
Transposed Matrix
a11    a21
a12    a22
a13    a23 */
public class Question_3 {
    public static void transpose(int matrix[][]){   //time complexity --> O(n ^ 2)
        for(int i = 0; i<matrix.length; i++){
            for(int j =0; j<matrix[0].length;j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int nums[][] = { 
            {1,4,9},
            {11,4,3},
            {2,2,3} };
            transpose(nums);
            System.out.println();
    }
}
