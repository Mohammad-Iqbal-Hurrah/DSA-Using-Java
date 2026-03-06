//more optimized approach for calculating max sub array sum --> time complexity = O(n)
public class Kadanes {
    public static int  kadanes(int array[]){
        int sum =0, maxSum = Integer.MIN_VALUE;
        //corner case if all elements are negative 
        int largest = Integer.MIN_VALUE;    //calculate the largest element of the array 
        for(int i =0; i<array.length;i++){
            largest = Math.max(largest,array[i]);
        }
        for(int i =0; i<array.length;i++){
            sum =  sum + array[i];
            if(sum<0){
                sum = 0;
            }
            maxSum = Math.max(maxSum,sum);
        }
        if(maxSum >=0){     //if maxSum is positive then return it 
            return maxSum;
        }
        //else return the largest element of the array 
        else{
            return largest;
        }
    }
    public static void main(String args[]){
        int array[] = {-2,4,6,8,-10};
        System.out.println("Max Sum = "+kadanes(array));
    }
}
