/*Question 5: Given an integer array nums, return all the triplets [nums[i], nums[j],   
nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0. 
Notice that the solution set must not contain duplicate triplets. 

Example 1: 
Input: 
nums = [-1, 0, 1, 2, -1, -4]
Output: [ [-1, -1, 2] , [-1, 0, 1] ] */
public class Question_5 {   //Time Complexity = O(n*3)
    //triplets 
    public static void triplets(int array[]){
        for(int i =0;i < array.length;i++){
            for( int j =i+1; j<array.length;j++){
                for(int k =j+1; k<array.length; k++){
                    if((array[i] + array[j] + array[k] == 0) && (i != j) && (i!=k) && (j!=k)){
                        System.out.print("["+array[i]+","+array[j]+","+array[k]+"]");
                    }
                    
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Question Number 5: ");
        int nums[] = {-1, 0, 1, 2, -1, -4};
        triplets(nums); 
    }
}
