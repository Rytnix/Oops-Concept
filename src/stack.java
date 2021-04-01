import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
A stack class with a I/O as bufferedReader

 */

public class stack
{
    int stck[] = new int[10];
    int top;
    int data;

    stack()             //Initialization of top
    {
        top=-1;
    }
    void push(int k)
    {                                                         /* push operation */
            if(top == stck.length-1) {
            System.out.println("Stack is full");
            return;
        }

        else
            top++;
        stck[top]=k;
    }
    void pop()
    {
        if(top==-1) {
            System.out.println("underflow");
            return;
        }
        else
            data = stck[top];
        System.out.println(data);
        top--;
    }

}

class access3
{
    public static void main(String[] args)
    {
        stack st= new stack();
        for(int i=0;i<10;i++)
        st.push(i);
        for(int i=9;i>=0;i--)
            st.pop();


    }
}
