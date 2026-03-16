
public class pairsInArray {

    //print pairs logic --> time complexity = O(n*2)
    public static void printPairs(int array[]) {
        System.out.println("Printing pairs: ");
        int totalPairs = 0;
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            System.out.println("\nPairs of "+current);
            for (int j = i + 1; j < array.length; j++) {
                System.out.print("(" + current + "," + array[j] + "),");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs = "+totalPairs);
    }

    public static void main(String args[]) {
        int array[] = {2, 4, 6, 8, 10};
        printPairs(array);
    }
}
