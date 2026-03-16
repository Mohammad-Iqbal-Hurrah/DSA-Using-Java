/*Question 2 : Print out the sum of the numbers in the second row of the “nums” array.
Example :
Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
Output - 18 */
public class Question_2{
    public static int Sum(int array[][]){
        int sum = 0;
        int row = 1;
        for(int i =0; i<array[0].length;i++){
            sum += array[row][i];
        }
        return sum;
    }
    public static void main(String args[]){
        int nums[][] = { 
            {1,4,9},
            {11,4,3},
            {2,2,3} };
    System.out.println(Sum(nums));
    }
}