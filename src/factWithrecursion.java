import java.util.Scanner;

public class factWithrecursion
{
     int fact(int n)
    {
        if(n==0)
            return 1;
        else
            return n*fact(n-1);
    }
}
class access9
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        factWithrecursion ob = new factWithrecursion();
        int t =ob.fact((sc.nextInt()));
        System.out.println(t);
    }
}
