public class BubbleSort{
    //bubble sort algorithm
    public static void bubbleSort(int array[]){ //time complexity = O(n*2)
        System.out.println("\nBubble Sort Algorithm: ");
        for(int i =0; i<array.length;i++){  //run n times 
            for(int j =0; j<array.length-i-1;j++){  //run n-i-1 times 
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    //print array
    public static void printArray(int array[]){
        for(int i =0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) {
        int nums[] = {20,5,6,2,1,9,0,67};
        System.out.println("Array Befor Bubble Sort ");
        printArray(nums);
        bubbleSort(nums);
        System.out.println("Array After Bubble Sort ");
        printArray(nums);
    }
}