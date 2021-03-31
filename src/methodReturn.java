public class methodReturn
{
    int i,j;
    methodReturn(int a,int b)
    {
        i=a;
        j=b;

    }
    int volume(int k)
    {
        return i*j*k;
    }

}
class access7
{
    public static void main(String[] args) {
        methodReturn ob=new methodReturn(1,2);
        int k = ob.volume(3);
        System.out.println(k);
    }
}
