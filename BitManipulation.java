public class BitManipulation {
    public static void main(String[] args){

/*         // swapping two no whithout a temp variable
        int a = 5; // 0101
        int b = 7; // 0111
        System.out.println(a);
        System.out.println(b);

        a = a^b; // 0010
        b = a^b; // 0010 ^ 0111 => 0101
        a = a^b; // 0010 ^ 0101 => 0111
        System.out.println("After swapping: ");
        System.err.println(a); 
        System.out.println(b); */

        System.out.println(binaryToDecimal("1111"));

    }

    public static boolean isEven(int num){
        // least significant bit of even no is alwasy 0 and for odd no it is 1
        return (num & 1) == 0;
    }

    public static boolean isPowerOf2(int num){
        // power of 2 have only one bit set to 1 e.g., 2 => 10; 4=> 100; 8 => 1000
        // a number less than power of 2 have all bit 1 except the position at which the bit is 1 in the no. which is power of 2
        // so & of n and n-1 is 0 if n is power of 2

        return (num & (num-1)) == 0;
    }

    public static int toggleBit(int num, int pos){
        // n = 5 => 0101
        // we will use bitmask and set 1 at the position we want to toggle
        // bit mask => 0010
        // now we will use xor if the position in original no 1 then xor with bitmask makes it 0 or 0 to 1 

        int bitMask = 1<<pos;
        return num^bitMask;
    }

    public static int countNumOf1(int num){
        int count = 0;
        int n = num;

        // n = 5 => 0101
        // n-1 = 4 => 0100
        // subtracting 1 from n flips all bits after(including) rightmost 1
        // we repeat this process until all the 1 are removed and count every remove

        while(n!=0){
            n = n & (n-1);
            count++;
        }
        return count;
    }

    public static String decimalToBinary(int num){
        int n = num; 
        StringBuilder binary = new StringBuilder();
        while(n!=0){
            binary.append(n%2);
            n = n/2;
        }
        return binary.reverse().toString();
    }

    public static int binaryToDecimal(String binary){
        int num = 0;
        int power = 0;

        for (int i = binary.length()-1; i>=0; i--){
            if(binary.charAt(i) == '1'){
                num += Math.pow(2, power);
            }
            power++;
        }
        return num;
    }

}