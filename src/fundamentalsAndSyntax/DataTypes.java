package fundamentalsAndSyntax;

public class DataTypes {
    public static void main(String args[]){

        /*
         * NOTE:
         * In programming languages, when initialising a variable without
         * a value like:
         *          int x;
         *          int y;
         * No default value is placed in the locations of these
         * varialbes.
         * This causes undefinied behaviour when accessing the value of
         * varialbe (in our case 'x' or 'y' before assignment).
         *
         * Java handles this in two ways:
         *      - assigning a default value to instance variables
         *      - explicit error is thrown for using varialbe before
         *      initial assignement
         */

    // primitive
    int i = 10;
    System.out.println("The range of integer is "+ Integer.MIN_VALUE+  " to " + Integer.MAX_VALUE);

        float f = 10.1F;
        System.out.println("The range of float is "+ Float.MIN_VALUE+  " to " + Float.MAX_VALUE);
    //
    // 'f' or 'F' here represents the number before it 
    // to be parsed as 32bit (by default 64bit.)
    // 32bit : Sign (1 bit) + exponent (8 bits) + Mantissa (23 bits)
    // 64bit : Sign (1 bit) + exponent (11 bits) + Mantissa (52 bits)
    //
        double d = 10.1;
        System.out.println("The range of float is "+ Double.MIN_VALUE+  " to " + Double.MAX_VALUE);

        char c = 'c';
        System.out.println("The range of float is "+ Character.MIN_VALUE+  " to " + Character.MAX_VALUE);

        boolean b = true;

        byte by = 0;
        System.out.println("The range of float is "+ Byte.MIN_VALUE+  " to " + Byte.MAX_VALUE);

        short s = 32767;
        System.out.println("The range of float is "+ Short.MIN_VALUE+  " to " + Short.MAX_VALUE);

        long l = 9223372036854775807L;
        System.out.println("The range of float is "+ Long.MIN_VALUE+  " to " + Long.MAX_VALUE);


        //type casting

    //non-primitive

    }
}
