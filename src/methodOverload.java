/*
public class methodOverload is a class made to show the method overload in an program
 */
public class methodOverload {


    void overload()                                              // 1st method with name overload
    {
        System.out.println("First overload");
    }

    void overload(int a)                                      // 2nd method with name overload but with a parameter
    {

        System.out.println("Second overload with a=" + a);
    }

    void overload(int a, int b)                           // 3rd method with name overload but with two parameter
    {
        System.out.println("Third overload with a=" + a + "with b=" + b);
    }

}
class access8
{

    public static void main(String[] args) {
        methodOverload ib= new methodOverload();
        ib.overload();
        ib.overload(5);
        ib.overload(5,6);

    }
    }
