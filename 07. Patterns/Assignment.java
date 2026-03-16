
public class Assignment {

    //hollow rectangle method 
    public static void hollowRectangle(int rows, int cols) {
        System.out.println("\nnHollow rectangle: \n");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                if ((i == 1 || i == 3) || (j == 1 || j == 5)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    //inverted and rotated half pyramid 
    public static void invertedAndRotatedPyramid(int r) {
        System.out.println("\n\nInverted and rotated half pyramid: \n");
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Inverted Half Pyramid With Number Pattern    
    public static void invertedNumberHalfPyramid(int row) {
        System.out.println("\n\nInverted half pyramid with number pattern: \n");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //Floyd's Pyramid Pattern 
    public static void floydPyramid(int r) {
        System.out.println("\n\nFloyd's Pyramid Pattern: \n");
        int counter = 1;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    //0-1 triangle 
    public static void zeroOneTriangle(int r) {
        System.out.println("\n\nZero One Triangle: \n");
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 "); //1 at odd places 
                } else {
                    System.out.print("0 ");  //0 at even places 
                }
            }
            System.out.println();
        }
    }

    //butterfly pattern pattern 
    public static void butterfly(int r) {
        System.out.println("\n\nButterflu Pattern: \n");
        //upper part of the butterfly
        for (int i = 1; i <= r; i++) {
            //left Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            //spaces 
            for (int k = 1; k <= (2 * r - 2 * i); k++) {
                System.out.print("  ");
            }
            //right stars 
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //lower part 
        for (int i = r; i >= 1; i--) {
            //left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            //spaces in between
            for (int j = 1; j <= (2 * r - 2 * i); j++) {
                System.out.print("  ");
            }
            //right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //solid rhombus pattern 
    public static void solidRhombusPAttern(int r) {
        System.out.println("\n\nSolid Rhombus Pattern: \n");
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= r; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //hollow rhombus 
    public static void hollowRhombus(int r) {
        System.out.println("\n\nHollow Rhombus: \n");
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= r; k++) {
                if ((i == 1 || i == r) || (k == 1 || k == r)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    //diamond pattern 
    public static void diamond(int r) {
        System.out.println("\n\nDiamond PAttern: \n");
        //upper part 
        for (int i = 1; i <= r; i++) {
            //spaces 
            for (int j = 1; j <= r - i; j++) {
                System.out.print("  ");
            }
            //stars 
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //lower part of pyramid to make it diamond like shape 
        for (int i = r; i >= 1; i--) {
            //lower part spaces 
            for (int j = 1; j <= r - i; j++) {
                System.out.print("  ");
            }
            //stars 
            for (int k = 2 * i - 1; k >= 1; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        // Pattern 1 Hollow rectangle 
        hollowRectangle(5, 4);

        // Pattern 2 Inverted and rotated pyramid 
        invertedAndRotatedPyramid(5);

        // Pattern 3 Inverted half pyramid with number pattern 
        invertedNumberHalfPyramid(5);

        // Pattern 4 Floyd's Pyramid Pattern 
        floydPyramid(5);

        // Pattern 5 0-1 Triangle 
        zeroOneTriangle(5);

        // Pattern 6 Buttefly Pattern 
        butterfly(5);

        // Pattern 7 Solid Rhombus Pattern 
        solidRhombusPAttern(5);

        // Pattern 8 Hollow Rhombus 
        hollowRhombus(5);

        // Pattern 9 Diamond Patern 
        diamond(4);
    }
}
