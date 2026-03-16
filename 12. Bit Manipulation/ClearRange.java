public class ClearRange {
    public static int clearRangeOfBits(int number, int i , int j){
        int a = (~0)<<j+1;
        int b = (1<<i)-1;
        return number & (a|b);
    }
    public static void main(String args[]){
        //15 = 00001111, i = 2, j = 7
        // ==> 00000011 = 3 in decimal 
        System.out.println(clearRangeOfBits(15,2,7));   
    }
}
