// single line comment

/* this is
multiple lines
           comment */

package fundamentalsAndSyntax;
/*A package in Java is a mechanism used to group related classes,
interfaces, and sub-packages into a single unit */

public class BasicSyntax {
    //A class is a blueprint or template used to create objects. BasicSyntax is a class.
    public static void main(String[] args) {
        /*
        * public - It is an access modifier. This class can be accessed publicly.
        * static - It is a keyword. Method can be called without creating an instance of the class.
        * void - This is return type. This method is returning no datatype or value.
        * main - This is method name, main specifically is the starting point,
        JVM searches for this, code will not be executed without it.

        * String - https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
        * args - Stands for arguments, it is an array that accepts stream of arguments.
        * */

        System.out.println("Hello Mom");

    }
}