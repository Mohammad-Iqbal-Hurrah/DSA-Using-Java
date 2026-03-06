public class BinarySearch {
    //binary search
    //time complexity of binary search is o(lon n)
    public static int binarySearch(int array[], int key){
        int low = 0;
        int high = array.length-1;
        while(low<=high){
            int mid =(low+high)/2;
            //compare element at middle index of the array with the key and return that index if matched 
            if(array[mid] == key){
                return mid;
            }
            //if the element at middle index is less than key, then search in the right half 
            else if(array[mid]<key){
                low = mid+1;
            }
            //else seacrh in the lsft half 
            else{
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {10,20,30,40,50,60};
        int idx = binarySearch(numbers, 60);
        if(idx<0){
            System.out.println("Element not present in the array.");
        }else{
            System.out.println("Element found at index: "+idx);
        }
    }
}
