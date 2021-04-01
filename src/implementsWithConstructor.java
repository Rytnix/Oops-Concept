import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
/*
     A example of a class with constructor
 */

public class implementsWithConstructor {
    int width,height,depth,a;

    implementsWithConstructor(int a) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         width = Integer.parseInt(br.readLine());
        height = Integer.parseInt(br.readLine());
        depth = Integer.parseInt(br.readLine());
        this.a=a;


    }
    int volume()
    {
        return width*height*depth*a;
    }
}

class access2
{
    public static void main(String[] args) throws IOException
    {
        implementsWithConstructor ob = new implementsWithConstructor(5);
         if(ob.volume()==30)
             throw new ArithmeticException("wrong entered");
         else
        System.out.println(ob.volume());
       // implementsWithConstructor ob1 = new implementsWithConstructor(5);
        //System.out.println(ob1.volume());

    }
}