public class useStatic {
    static int a = 5;
     static int b;
    final int d=10;                         //datatype marked as final can not be altered by value.

    static void method(int c)
    {
        b=c+20;
        System.out.println("Method call"+b);
    }
    static                                       // static block runs on runtime before main method
    {
        b=10;

        System.out.println(a+" "+b);
    }

    public static void main(String[] args) {
        method(5);
    }
}
class access10
{
    public static void main(String[] args) {
        useStatic.method(3);                   //static methods can be accessed outside their class with just
    }                                            // "." operator with <class name>.<method name>

}
