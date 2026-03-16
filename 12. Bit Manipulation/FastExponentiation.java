//Calculate a power b
public class FastExponentiation{
    public static int FastExponentiation(int a , int b){    //time complexity = O(logN)==>b is analyzed as per the number of bits 
        int ans = 1;
        while(b>0){
            if((b&1)==1){
            ans *= a;
        }
        a = a*a;
        b = b>>1;
        }
        return ans;
    }
    public static void main(String args[]){
        System.out.println(FastExponentiation(10,100));
    }
}