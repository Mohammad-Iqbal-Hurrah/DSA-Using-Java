
public class DescendingCountSort {

    //Descending Count sort 
    public static void descendingCountSort(int nums[]) {
        //calculate largest element in the array
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        //create count array of size = max+1 to store frequency of elements 
        int count[] = new int[max + 1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;       //update frequency of numbers  
        }
        //sorting
        int j = 0;
        for (int i =count.length-1; i >=0 ; i--) {
            while (count[i] > 0) {
                nums[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    //print array
    public static void printArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        descendingCountSort(nums);
        printArray(nums);
    }
}
