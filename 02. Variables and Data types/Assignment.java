import java.util.*;
public class Assignment{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Q1 input three numbers and calculate their average 
        System.out.println("Question number 1:- \n");
        System.out.print("Enter three Numbers: \n");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        double average = (n1+n2+n3) / 3.0;
        System.out.println("Average = "+average);

        // Q2 Input side of a square and calcuate its area 
        System.out.println("Question number 2:- \n");
        System.out.print("Enter length of side of a sqaure: ");
        int side = sc.nextInt();
        System.out.println("Area of a square = "+side*side);

        // Q3 Enter cost of 3 items from user(float). Print total cost of items. Akso try adding 18% GST tax
        System.out.println("Question number 3:- \n");
        System.out.println("Enter cost of first item:- ");
        float c1 = sc.nextFloat();
        System.out.println("Enter cost of second item:- ");
        float c2 = sc.nextFloat();
        System.out.println("Enter cost of third item:- ");
        float c3 = sc.nextFloat();
        float totalCost = c1+c2+c3;
        System.out.println("Total amount without GST = "+totalCost);
        float GST = (totalCost*18)/100;
        System.out.println("Total amount with GST = "+(totalCost+GST));

        // Q4 Guess output of the code 
        System.out.println("Question number 4:- \n");
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 100;
        float f = 3.14f;
        double d = 99.9954;
        // result = (f*b)+(i%c)-(d*s); //NOTE: look at the largest data type among these 
        // System.out.print(resut)

        // Q5 wil the following statement work in java:- int $ = 24;
        System.out.println("Question number 5:- \n");
        int $ = 24;
        System.out.print($);
        System.out.print("Yest it works ");


    }
}