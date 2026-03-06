// creation of arrays, input, output and modification of arrays
import java.util.*;
public class Arrays1{
    //input array elements or marks 
    public static int[] inputMarks(int marks[], String subjects[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of your subjects: \n\n");
        for(int i =0; i<subjects.length;i++){
            System.out.print("Enter marks of "+subjects[i]+": ");
            marks[i] = sc.nextInt();
        }
        sc.close();
        return marks;
    }

    //display marks of all subjects, total marks and percentage  
    public static void display(int marks[], String subjects[]){
        System.out.println("All subject marks: \n\n");
        int sum = 0;
        for(int i=0; i<subjects.length;i++){
            System.out.println("Marks in "+subjects[i]+" = "+marks[i]);
            sum += marks[i];
        }
        System.out.println("Total marks obtained = "+sum+". Max marks = "+5*100);
        System.out.println("Percentage = "+(sum/5)+"%");
    }

    //update marks of each subject by 1;
    public static int[] updateMarks(int marks[]){
        System.out.println("Relaxation mark of 1 for all subjects: \n\n");
        for(int i =0;i<marks.length;i++){
            marks[i] += 1;
        }
        return marks;
    }
    public static void main(String args[]){
        int marks[] = new int[5];
        String subjects[] = {"Physics", "Chemistry","Maths","English", "Additional Subject"};
        //take input from user 
        marks = inputMarks(marks,subjects);

        //display array
        display(marks,subjects);

        //update marks 
        marks = updateMarks(marks);

        //display marks after updation 
        display(marks, subjects);

    }
}