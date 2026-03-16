public class ClearIBits {
    public static int clearIBits(int number, int i){
        return (number & ~(0)<<i);
    }
    public static void main(String args[]){
        System.out.println(clearIBits(15, 2));
    }
}
