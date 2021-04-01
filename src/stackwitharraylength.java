import java.util.Scanner;

public class stackwitharraylength
{
    private int stck[];
    private int top;

    stackwitharraylength(int n)
    {
        stck = new int[n];
        top=-1;
    }
    void push(int data)
    {
        if(top==(stck.length-1))
        {
            System.out.println("overflow");
        }
        else
            stck[++top]= data;

    }
    int pop()
    {
        if(top==-1)
        {
            System.out.println("underflow");
            return 0;
        }
        else
             return stck[top--];

    }

}
class access12
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements to add");
        int m=sc.nextInt();
        int k=m;
        stackwitharraylength ob = new stackwitharraylength(m);
        for(int i=0;i<k;i++)
        {
            ob.push(sc.nextInt());
        }
        for (int i=0;i<k;i++)
        {
            if(i==0) System.out.print("[");
            System.out.print(ob.pop()+" ");
            if(i==k-1) System.out.print("\b]");
        }
    }
}
