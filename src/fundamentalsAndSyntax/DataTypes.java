package fundamentalsAndSyntax;

public class DataTypes {
    public static void main(String[] args) {

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
