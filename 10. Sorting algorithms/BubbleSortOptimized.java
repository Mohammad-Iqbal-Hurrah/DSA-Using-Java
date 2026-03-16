public class BubbleSortOptimized {
    //optimized bubble sort 
    public static void bubbleSort(int array[]){
        for( int i=0; i<array.length;i++){
            boolean swapped = false;
            for(int j = 0; j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                    System.out.println("Hello");
                }
                if(!swapped){
                    System.out.println("Array was already sorted or nearly sorted ");
                    break;
                }
            }
        }
    }

    public static void printArray(int array[]){
        for(int i =0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};   //what is the array is already sorted
        bubbleSort(nums);
        printArray(nums);
    }
}
