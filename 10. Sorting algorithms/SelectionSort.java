
public class SelectionSort {

    //print array
    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //selection sort
    public static void selectionSort(int array[]) { //time complexity = O(n*2)
        for (int i = 0; i < array.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minPos]) {
                    minPos = j;
                }
            }
            //swap
            int temp = array[minPos];
            array[minPos] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int nums[] = {20, 4, 7, 0, 1, 6,45};
        printArray(nums);
        System.out.println();
        selectionSort(nums);
        printArray(nums);
    }
}
