public class returningObjects
{
    int i;
    returningObjects(int a)
    {
        i=a;


    }
    returningObjects test()
    {
        returningObjects nr= new returningObjects(i+10);
        return nr;
    }
}
class access5
{
    public static void main(String[] args) {
        returningObjects ob1 = new returningObjects(15);
        returningObjects ob2;
        ob2=ob1.test();
        System.out.println(ob1.i);
        System.out.println(ob2.i);
        ob2=ob2.test();

        System.out.println(ob2.i);

    }
}
