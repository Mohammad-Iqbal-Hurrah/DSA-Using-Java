import java.util.*;
public class Assignment{
    public static void main(String args[]){
        // Q1 how many times hello is printed --> Only 2 times when i = 0 and when i = 3
        
        System.out.println("Question number 1: ");
        for(int i = 0;i<5;i++){
            System.out.println("Hello");
            i += 2;
        }

        // Q2  read a set of integers and print sum of even and odd numbers 

        Scanner sc = new Scanner(System.in);
        System.out.println("Question Number 2: ");
        int evenSum = 0 , oddSum = 0;
        for(int i = 1; i<=20; i++){
            if(i%2 == 0){
                evenSum += i;
            }else{
                oddSum += i;
            }
        }
        System.out.println("Even Sum = "+ evenSum+" And Odd Sum = "+oddSum);

        // Q3  Find the factorial of a number 

        System.out.println("Question number 3: ");
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int fact = 1;
        for(int i = 1; i<=number;i++){
            fact *= i;
        }
        System.out.println("Factorial of a given number = "+fact);

        // Q4  print multiplication table of a number

        System.out.println("Question number 4: ");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Multiplication table of a given number is: ");
        for(int i = 1; i<11;i++){
            System.out.println(n+"*"+i+" = "+n*i);
        }
    }
}