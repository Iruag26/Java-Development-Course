package fundamentalsAndSyntax;

public class DataTypes {
    public static void main(String args[]){

        /*
         * NOTE: 
         * In programming languages, when initialising a variable without
         * a value like:
         *          int x;
         *          int y;
         * No default value value is placed in the locations of these 
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
    float f = 10.1F; 
    //
    // 'f' or 'F' here represents the number before it 
    // to be parsed as 32bit (by default 64bit.)
    // 32bit : Sign (1 bit) + exponent (8 bits) + Mantissa (23 bits)
    // 64bit : Sign (1 bit) + exponent (11 bits) + Mantissa (52 bits)
    //
    float f2 = (float) 10.1; //type casting
    double d = 10.1;
    char c = 'c';
    boolean b = true;
    byte by = 0;
    /*
    short: -32,768 to 32,767
    long: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    */
    short s = 32767;
    long l = 9223372036854775807L;

    //type casting

    //non-primitive

    }
}
