public class largestInArray {
    //largets in an array code 
    public static int largestInArray(int array[]){
        int largest = Integer.MIN_VALUE;    //-infinity
        int smallest = Integer.MAX_VALUE;   //+infinity
        for(int i = 0; i<array.length;i++){
            largest = Math.max(largest,array[i]);
            smallest = Math.min(smallest,array[i]);
        }
        System.out.println("Smallest = "+smallest);
        return largest;
    }
    public static void main(String args[]){
        int numbers[] = {10,100,45,700,34,89,90,5};
        System.out.println("Largest = "+largestInArray(numbers));
    }
}
