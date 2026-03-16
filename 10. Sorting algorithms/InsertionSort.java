public class InsertionSort {
    //insertion sort 
    public static void insertionSort(int array[]){
        for(int i =1; i<array.length;i++){
            int currentElement = array[i];  //element at index 1
            int prevIdx = i-1;      //1-1 = 0 index 0;
            //find the correct position to insert 
            while(prevIdx>=0 && array[prevIdx] > currentElement){
                array[prevIdx+1] = array[prevIdx];
                prevIdx--;
            }
            //insert correct element at correct position 
            array[prevIdx+1] = currentElement;
        }
    }

    //print array
    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String args[]){
        int nums[] = {20, 4, 7, 0, 1, 6,45};
        insertionSort(nums);
        printArray(nums);
    }
}
