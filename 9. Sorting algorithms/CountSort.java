public class CountSort{
    //Counting Sort 
    public static void countingSort(int array[]){
        //calculate range --> largest elemnt
        int maxElement = Integer.MIN_VALUE;
        for(int i =0; i<array.length;i++){
            maxElement = Math.max(maxElement,array[i]);
        }
        //create count array to store frequency of elements 
        int count[] = new int[maxElement+1];    //include 0 that is the reason for largest + 1 = size of the count array
        for(int i = 0; i<array.length;i++){
            count[array[i]]++;    //Count frequency of elements in array at index i
        }
        //sorting 
        int j =0; 
        for(int i =0 ;i <count.length;i++){
            while(count[i]>0){
                array[j] = i;
                j++;
                count[i]--; 
            }
        }
    }

    //print array
    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
         int nums[] = {8, 4, 7, 0, 1, 6};
        countingSort(nums);
        printArray(nums);
    }
}