public class BitwiseOperators{
    public static void main(String args[]){
        //bitwise AND Operator (&)
        /*5 = 101 and 6 = 110
          101
        & 110
        = 100 = 4 in decimal */
        int and = (5 & 6);
        System.out.println("Bitwise AND between 5 and 6 = "+ and);
        // Biteise OR OPerator (|)
        /* 101
         | 110
         = 111 = 7 in decimal */
         int or = (5|6);
         System.out.println("Bitwise OR between 5 and 6 = "+ or);

         //Bitwise XOR Operator (^)
         /*
         101
        ^110 
        =011 = 3 in decimal */
        int xor = (5^6);
        System.out.println("Bitwise XOR between 5 and 6 = "+xor);

        //Bitwise NOT (~)
    /*  1. 5 = 00000101 ---> MSB = 0 --> Positive number 
        2. flip all bits 11111010 --> MSB = 1 means a neagative number (- sign )--> computer stores -ve numbers in two's complement 
        3. flip the bits again 00000101
        4. now add 1           +      1
                               = 00000110 --> 6 in decimal = -6 with sign 
         */
        System.out.println("Bitwise "); //TRICK ~n = -(n+1)

        //Bitwise Left Shift Operator(<<)
        /*Performs multiplication 
        example n << k = n(2^k) = n multiplied by 2 power k 
        5 = 00000101
        5 << 2 = 00010100 = 20 in decimal */
        System.out.println(5<<2);

        //Bitwise Right Shift Operator(>>))
        /*Performs Division 
        example n >> k = n/(2^k) = n divided by 2 power k 
        5 = 00000101
        5 >> 2 = 00000001 = 1 in decimal */
        System.out.println(5>>2);
    }
}