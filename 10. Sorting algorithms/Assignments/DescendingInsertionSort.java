public class DescendingInsertionSort {
    // Descending Insertion Sort Logic 
    public static void descendingInsertionSort(int array[]){
        for(int i =1; i<array.length;i++){
            int currentElement = array[i];  //element at index 1
            int prevIdx = i-1;      //1-1 = 0 index 0;
            //find the correct position to insert 
            while(prevIdx>=0 && array[prevIdx] < currentElement){
                array[prevIdx+1] = array[prevIdx];
                prevIdx--;
            }
            //insert correct element at correct position 
            array[prevIdx+1] = currentElement;
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
        descendingInsertionSort(nums);
        printArray(nums);
    }
}
