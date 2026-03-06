public class PrintSubArrays {
    //print sub arrays
    public static void printSubArrays(int array[]){
        int totalSubArrays = 0;
        for(int i =0; i<array.length;i++){  //Calculate start of sub arrays
            System.out.println("Sub Arrays of "+array[i]);

            for(int j =i;j<array.length;j++){   //calculate end of sub arrays
                
                for(int k =i; k<=j;k++){
                    System.out.print(array[k]+" "); //print sub arrays 
                }
                totalSubArrays += 1;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sub Arras: "+totalSubArrays);
    }
    public static void main(String[] args) {
        int array[] = {2,4,6,8,10};
        printSubArrays(array);
    }
}
