import java.util.*;
public class Assignment{
    public static void main(String args[]){
        // Q1 Take input from user and print whether it is positive or negative 
        Scanner sc = new Scanner(System.in);
        System.out.println("Question number 1: \n");
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        if(number>=0){
            System.out.print("Positive number ");
        }else{
            System.out.print("Negative number ");
        }


        // Q2 predict whether you have a fever or not 
        System.out.println("Question number 2: \n");
        System.out.println("Enter your body temperature: ");
        double temp = sc.nextInt();
        if(temp>100){
            System.out.println("You have fever. Please take medicine.");
        }else{
            System.out.println("You dont have fever. You can enjoy.");
        }

            // Q3 input week number(1-7) and print the day using switch case 
            System.out.println("Question number 3: \n");
            System.out.print("Enter number betweek 1 and 7: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Monday");
                    break;
                case 2:
                    System.out.print("Tuesday");
                    break;
                case 3:
                    System.out.print("Wednsday");
                    break;
                case 4:
                    System.out.print("Thursday");
                    break;
                case 5:
                    System.out.print("Friday");
                    break;
                case 6:
                    System.out.print("Saturday");
                    break;
                case 7:
                    System.out.print("Sunday");
                    break;
                default:
                    System.out.print("Input out of range.");
            }

        // Q4 Find value of x and y in the following code 

        System.out.println("\nQuestion number 4: \n");
        int a = 63, b = 36;
        boolean x = (a<b) ? true:false; // x = false (a > b) condition is false 
        int y = (a>b) ? a:b;    // y = 63 (63>36) condition is true 
        System.out.println("X = "+x+", and Y = "+y);

        // Q5  Write a java program that takes year as input and print whether the year is leap year or not 
        System.out.println("Question 5: \n");
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if((year%4 == 0 && year % 100 != 0)|| (year%400 == 0)){
            System.out.println("Leap year");
        }else{
            System.out.println("Not a leap year");
        }
    }
}