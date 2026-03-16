//linear search 
public class linearSearch {
    //linear search
    public static int linearSearch(int array[],int key){
        if(array.length<1){
            System.out.println("Empty array");
            return Integer.MIN_VALUE;
        }
        for(int i = 0; i<array.length;i++){
            if(array[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,8,9};
        int idx = linearSearch(numbers,1);
        if(idx < 0){
            System.out.println("Element not found in the array");
        }else{
            System.out.println("Element found at index: "+idx);
        }
    }
}
