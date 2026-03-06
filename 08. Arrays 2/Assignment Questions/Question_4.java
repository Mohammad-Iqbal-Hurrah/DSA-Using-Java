/*Question 4: Given n non-negative integers representing an elevation map where the width of 
each bar is 1, compute how much water it can trap after raining. 

Example 1: 
Input: 
height = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1] 
Output: 6 
Explanation: 
The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped. 
 */

public class Question_4 {

    //Trap Rain Wtaer Logic 
    public static int trapRainWater(int height[]) {
        int trappedWater = 0;
        //create an array that stores left maximum bar height 
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        //Create one more array that stores maximum heights of right bars 
        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1]; //height of right extreme bar
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        for (int i = 0; i < height.length; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += (waterLevel - height[i]); //Multiplied by width whivh is 1 
        }
        return trappedWater;
    }

    public static void main(String args[]) {
        System.out.println("Question 4 of arrays: ");
        int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Trapped Water: " + trapRainWater(height));
    }
}
