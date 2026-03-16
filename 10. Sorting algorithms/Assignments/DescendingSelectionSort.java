public class DescendingSelectionSort {
    //descending selection sort logic 
    public static void descendingSelectionSort(int array[]){
        for(int i =0; i<array.length-1;i++){
            int minPos = i;
            for( int j = i+1; j<array.length; j++){
                if(array[minPos]<array[j]){
                    minPos = j;
                }
            }
            //swap 
            int temp = array[minPos];
            array[minPos] = array[i];
            array[i] = temp;
        }
    }
    //print array
    public static void printArray(int array[]){
        for( int i =0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String args[]){
        int nums[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        descendingSelectionSort(nums);
        printArray(nums);
    }
}
