package fundamentalsAndSyntax;

public class VariablesAndScope {

    //Instance variable
    char d = 'd';

    //Static variable
    static char g = 'g';

    void normalMethod(){
        //Local variable(local to normalMethod), can't be accessed out of normalMethod method scope.
        int a = 2;
        System.out.println(a);

        System.out.println(d); //Works because this method is non-static.
        System.out.println(g);
    }
    public static void main(String[] args) {
        //System.out.println(d); Does not work because main method is static.
        //To access the variable you need to make an object of the class.

        VariablesAndScope vns = new VariablesAndScope();

        System.out.println(vns.d);
        System.out.println(g);//no need to make an instance to access static variable.
        /* Why can't static methods access non-static class level variables directly?
        *
        * */

        vns.normalMethod();

    }


}
