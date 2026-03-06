/*Question 1: Given an integer array nums, return true if any value appears at least twice in the 
array, and return false if every element is distinct.\
Example: 
Input: 
nums = [1, 2, 3, 1] 
Output: true */

public class Question_1 {

    //Contains duplicate or not logic using nested loops 
    public static boolean isDistinct(int array[]) {
        for (int i = 0; i < array.length; i++) {        //start from index 0 of the array 
            for(int j = i+1;j<array.length;j++){        //start from index i+1 = 1 for the first iteration 
                if(array[i] == array[j]){               //compare elements at index i and index j --> if both are equal return true = duplicate exists 
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        System.out.println("Question 1 of arrays: ");
        int array[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("Contains Duplicate: "+isDistinct(array));
    }
}
