public class MaxSubArraySum{
    //Max Sub Array Sum Brute Force Approach --> O(n*3)
    public static void printMaxSubArraySum(int array[]){
        int sum, maxSum = Integer.MIN_VALUE, minSum= Integer.MAX_VALUE;
        //start
        for(int i=0;i<array.length;i++){
            //end
            for(int j =i;j<array.length;j++){
                sum = 0;    //reinitialize sum variable for next subarray
                //calculate sum,maxSum and
                for(int k =i;k<=j;k++){
                    sum += array[k];    //add array element to sum variable 
                    
                }
                System.out.print(sum);
                //Calculate maximum and miimum sub array sum 
                maxSum = Math.max(maxSum, sum);
                minSum = Math.min(minSum, sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("MaxSum: "+maxSum+", MinSum: "+minSum);
    }
    public static void main(String[] args) {
        int array[] = {2,4,6,8,10};
        printMaxSubArraySum(array);
    }
}