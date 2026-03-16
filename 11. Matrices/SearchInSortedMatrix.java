//staircase search or search element in a sorted matrix --> row and column wise sorted 
public class SearchInSortedMatrix {
    public static boolean staircaseSearch(int matrix[][], int key){
        int row = matrix.length-1;
        int col = 0;
        while(row>=0 && col < matrix[0].length){
            if(matrix[row][col] == key){
                System.out.println("Found at ["+row+","+col+"]");
                return true;
            }
            else if(matrix[row][col] > key){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("Element not present in the matrix.");
        return false;
    }
    public static void main(String args[]){
        int matrix[][] = {{10,20,30,40},
                           {15,25,35,45},
                            {27,29,37,47},
                            {32,33,39,50}};
    int key = 49;
    staircaseSearch(matrix,key);
    }
}
