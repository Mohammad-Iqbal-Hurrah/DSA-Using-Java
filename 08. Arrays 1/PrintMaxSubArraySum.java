public class PrintMaxSubArraySum {
    //print max and minimum subarray sum
    public static void printMaxSubArraySum(int array[]){
        //brute force approach --> time complexity = O(n*3)
        int maxSum = Integer.MIN_VALUE, minSum = Integer.MAX_VALUE, sum =0;
        for(int i=0;i<array.length;i++){
            for(int j = i; j<array.length;j++){
                sum =0; //reinitialize sum variable for the next subarray
                for(int k = i;k<=j;k++){
                    sum += array[k];
                    maxSum = Math.max(sum, maxSum); //store MaxSubArray sum
                    minSum = Math.min(sum,minSum);  //Stoe MinSubArray Sum
                }
                System.out.print(sum+" ");  //Print sum of sub sarrays 
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Max Sum = "+maxSum+" and Min Sum = "+minSum);
    }
    public static void main(String args[]){
        int array[] = {2,4,6,8,10};
        printMaxSubArraySum(array);
    }
}
