
/*
This example is made to show how an objects are passed to a function
 */
public class argumentPassing

{
    int i,j;
     argumentPassing(int a , int b)    // default constructor
    {
        i=a;
        j=b;

    }
    void test( argumentPassing o)  // passing objects to test function
    {
        o.i *=2;
        o.j /=2;
    }

}

class acess4
{
    public static void main(String[] args) {
        argumentPassing ob=new argumentPassing(15,20);
        System.out.println("before"+ob.i+" "+ob.j);
        ob.test(ob);
        System.out.println("after"+ob.i+" "+ob.j);

    }
}
