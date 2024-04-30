import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args)
    {
        int a = 0,b = 1,c;
        Scanner myScanner = new Scanner(System.in);
        int x = myScanner.nextInt();
        if(x>0)
        {
            System.out.println(a);
        }
        if(x>1)
        {
            System.out.println(b);
        }
        x-=2;
        while(x>0)
        {
            c = a+b;
            System.out.println(c);
            a = b;
            b = c;
            x--;
        }
        myScanner.close();
    }
}