/*1. Get ith bit
2. Set ith bit 
3. Clear ith bit  
4. Update ith bit */
public class BitOperations {
    //get ith bit 
    public static int getIthBit(int number, int i  ){
        if((number & (1<<i)) == 0){
            return 0;
        }else {
            return 1;
        }
    }

    //Set ith bit 
    public static int setIthBit(int number, int i  ){
    return (number | (1<<i));
    }

    // clear ith bit 
    public static int clearIthBit(int number, int i  ){
    return (number & ~(1<<i));
    }

    //update ith bit 
    public static int updateIthBit(int number, int i, int newbit ){
        // Approach-1
        // if(newbit == 1){
        //     return setIthBit(number, i);
        // }else{
        //     retunr clearIthBit(number, i);
        // }
        //Another approach-2
        number = clearIthBit(number, i);
        return number | (newbit<<i);
    }
    public static void main(String args[]){
        System.out.print("Get 4th bit of 1100100 or 100: ");
        System.out.println(getIthBit(100, 4));   //100 in binary = 1100100
        System.out.print("Set first bit of 1100100 or 100 to 1: ");
        System.out.println(setIthBit(100, 1));
        System.out.print("Clear second bit of 1100100 or 100  to 0: ");
        System.out.println(clearIthBit(100, 2));
        System.out.print("update any bit of hundred 0 to 1 and 1 to 0: ");
        System.out.println(updateIthBit(100,1,1));
    }
}
