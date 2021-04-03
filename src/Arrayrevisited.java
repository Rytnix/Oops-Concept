public class Arrayrevisited
{
    static int arraylength(int a[])
    {
        return a.length;


    }
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int l=arraylength(a);
        System.out.println(l);
        for (int x: a)
        {
            System.out.println(x);

        }

    }
}
