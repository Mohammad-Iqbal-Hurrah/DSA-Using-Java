public class DecendingBubbleSort{
    //descending bubble sort logic
    public static void descendingBubbleSort(int array[]){
        for(int i =0; i<array.length;i++){
            for(int j = 0; j<array.length-1-i;j++){
                if(array[j] < array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
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
        descendingBubbleSort(nums);
        printArray(nums);
    }
}