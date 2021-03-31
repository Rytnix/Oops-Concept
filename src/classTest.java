public class classTest
{
    int a;
    String k;
    double n;
    void test()
    {
        double vol = a*n;
        System.out.println(vol);
        System.out.println(k);
    }
    int volume(int a,int b,int c)
    {
        System.out.println("Returning integer value");
        int v = a*b*c;
        return v;
    }
}
 class access
{
    public static void main(String[] args) {


        classTest tl = new classTest();
        classTest tk = new classTest() ;
            tl.a =5;              tk.a=6;
            tl.k="Hello Java";    tk.k="Hello programming";
            tl.n=6;               tk.n=7;


        tl.test();
        tk.test();
        int i =tl.volume(7,8,9);
        System.out.println(i);
    }
}
