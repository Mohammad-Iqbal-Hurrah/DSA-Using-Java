
//optimized max sub array sum using prefix array --> time complexity = O(n*2) < O(n*3)
public class PrefixArray {
    //max sub array sum optimized using prefix array
    public static void prefixSum(int array[]) {
        int sum, maxSum = Integer.MIN_VALUE, minSum = Integer.MAX_VALUE;
        int prefix[] = new int[array.length];
        prefix[0] = array[0];
        //calculate prefix array 
        for (int i = 1; i < array.length; i++) {
            prefix[i] = prefix[i-1] +array[i];
        }

        //calculate sum, maxSum and minSum
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                //if start i,e., i = 0 then sum = prefix[j] only 
                sum = i == 0? prefix[j]:prefix[j]-prefix[i-1];
                System.out.println(sum);    //print current sum of subarrays 
                maxSum = Math.max(sum,maxSum);  //calculate max sub array 
                minSum = Math.min(sum,minSum);  //calculate min sub array sum
            }
        }
        System.out.println("Max Sum: "+maxSum+" and Min Sum:"+minSum);
    }

    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10};
        prefixSum(array);
    }
}
