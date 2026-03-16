/* Question 1 : Print the number of 7’s that are in the 2d array.
Example :
Input - int[][] array = { {4,7,8},{8,8,7} };
Output - 2 */
public class Question_1{
    public static int printNumber_7(int array[][]){
        int count = 0;
        for(int i =0; i<array.length;i++){  //tim complexity --> O(n^2)
            for(int j = 0; j< array[0].length;  j++){
                if(array[i][j] == 7){
                    count += 1;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        int array[][] = { 
            {4,7,8},
            {8,8,7} };
    System.out.println(printNumber_7(array));
    }
}