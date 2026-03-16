import java.util.Scanner;
public class EvenOdd {
    public static void EvenOdd(int n){
        if((n & 1) == 0){
            System.out.println("Even Number ");
        }else {
            System.out.println("Odd Number ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        EvenOdd(n);
        
    }
}
