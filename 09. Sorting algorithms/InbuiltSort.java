import java.util.Arrays;
public class InbuiltSort {

    //print array
    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        int nums[] = {20, 4, 7, 0, 1, 6,45};
        Arrays.sort(nums);
        printArray(nums);
    }
}
