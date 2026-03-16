import java.util.*;
public class MatricesInputOutpot{

    //take input
    public static void inputMatrix(int matrix[][]){
        System.out.println("Input matrix Elements: ");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0 ;j <matrix[0].length;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    //output 
    public static void display(int matrix[][]){
        System.out.println("Matrix Elements are: ");
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0 ;j <matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    //search in a matrix 
    public static void search(int matrix[][], int key){
        for(int i =0; i<matrix.length;i++){
            for(int j =0; j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    System.out.println("Element found at index: ["+i+","+j+"]");
                    return;
                }
            }
        }
        System.out.println("Element not found");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        //input elements 
        inputMatrix(matrix);
        //display elements 
        display(matrix);

        //search
        search(matrix,5);


        sc.close();
    }
}