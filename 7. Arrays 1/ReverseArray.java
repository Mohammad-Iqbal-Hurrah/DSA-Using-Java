public class ReverseArray {
    //reverse an array logic -->time complexity = O(n/2) = O(n)
    public static void reverseArray(int array[]){
        int start = 0, end = array.length-1;
        while(start<end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
    //display array
    public static void displayArray(int array[]){
        for(int i =0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) {
        int array[] = {10,20,30,40,50};
        System.out.println("\nArray before reversing: ");
        displayArray(array);
        reverseArray(array);
        System.out.println("\nArray after reversing: ");
        displayArray(array);
    }
}
