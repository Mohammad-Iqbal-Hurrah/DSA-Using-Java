//count number of set bits in a number 
public class CountSetBits {
    static int countSetBits(int n){ //time complexity = O(logN) because any number is represented usng log n bits (e.g., 16 = 10000)
        int count = 0;
        while(n>0){
            if((n&1)==1){   //check Least Significant bit (LSB)
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String args[]){
        System.out.println(countSetBits(7));
    }
}
