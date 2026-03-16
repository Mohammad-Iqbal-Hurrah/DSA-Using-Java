/*check if a number is power of 2 or not 
4 = 100 and 3 = 011
take & of 100, 001 = 0 same pattern is followed  */
public class PowerOf2 {
    public static boolean powerOfTwo(int n){
        return (n&(n-1)) == 0;
    }
    public static void main(String args[]){
        System.out.println(powerOfTwo(12));
    }
}
