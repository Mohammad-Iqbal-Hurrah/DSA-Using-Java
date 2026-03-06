public class TrappingRainWater {
    public static int trappingRainWater(int array[]){   //Time complexity = O(n)
        int trappingWater =0;
        //cal left max
        int leftMax[] = new int[array.length];
        leftMax[0] = array[0];  //height of left extreme bar
        for(int i =1;i<array.length;i++){
            leftMax[i] = Math.max(array[i],leftMax[i-1]);
        }
        //cal right max
        int rightMax[] = new int[array.length];
        rightMax[array.length-1] = array[array.length-1];   //height of right extreme bar
        for(int i =array.length-2;i>=0;i--){
            rightMax[i] = Math.max(array[i],rightMax[i+1]);
        }
        //loop to calculate water level and trappeing water 
        for(int i = 0; i<array.length; i++){
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            trappingWater += (waterLevel-array[i]);
        }
        return trappingWater;
    }
    public static void main(String args[]){
        int array[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};  //Answer should be 11-->total water trapped 
        System.out.println("Trapping Rain Water: "+trappingRainWater(array));
    }
}
