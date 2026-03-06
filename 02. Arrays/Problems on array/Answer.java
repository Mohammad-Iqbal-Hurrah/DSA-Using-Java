
//GATE exam question
public class Answer {
        public static void main(String args[]) {
        int i = 0;
        int sum = 0;
        while(i < 5){
            i++;
            if(i == 3)
                continue;
            sum += i;
        }
        System.out.print(sum);
    }
}
//OPTIONS 
/*  A) 12
    B) 13
    C) 7
    D) 10
 */
