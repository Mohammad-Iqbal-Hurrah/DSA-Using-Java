
public class Assignment{
    //calculate average 
    public static float calcAverage(int n1, int n2, int n3){
        return  (n1+n2+n3)/3.0f;
    }
    
    //even or odd
    public static boolean isEven(int n){
        return n%2 == 0;
    }

    //Palindrome or not 
    public static boolean isPlaindrome(int n ){
        int number =  n;    
        int rev = 0;
        while(n>0){
            int rem = n%10; 
            rev = rev*10+rem;   //calculate reverse of a number 
            n /= 10;    //update the number 
        }
        return rev==number;
    }

    //sum of digits in a number 
    public static int sumOfDigits(int x){
        int sum = 0;
        while(x>0){
            int rem = x%10;
            sum += rem;
            x /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        // Q1 Write a method that computes average of three numbers 
        
        System.out.println("Question  number 1: ");
        int n1 = 10, n2 = 20, n3 = 30;
        System.out.print("Average = "+calcAverage(n1,n2,n3));

        // Q2 Write a method that returns true if a number is even and false if it is odd
       
       System.out.println("Question number 2: ");
        int number = 10;
        System.out.println("IsEven: "+isEven(number));

        // Q3 Check is a number is palindrome or not 
        
        System.out.println("Question number 3: ");
        int n = 1001;
        System.out.println("IsPalindrome: "+isPlaindrome(n));

        // Q4 read about min, max, sqrt, pow, average and abs methods and use them 
       
        System.out.println("Question number 4: ");
        int number1 = 10, number2 = 40;
        System.out.println("Max: "+Math.max(number1,number2));
        System.out.println("Min: "+Math.min(number1,number2));
        System.out.println("Square root of 25: "+Math.sqrt(25));
        System.out.println("5 square: "+Math.pow(5, 2));
        System.out.println("abs: "+Math.abs(number2));

        // Q5 Compute sum of digits in a number 
        System.out.println("Question number 5: ");
        int x = 2580;
        System.out.println("Sum of digits = "+sumOfDigits(x));

    }
}