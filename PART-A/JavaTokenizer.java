import java.util.StringTokenizer;
import java.util.Scanner;
public class JavaTokenizer {
    public static void main(String[] args) {
        String x;
        int s = 0;
        Scanner myScanner = new Scanner(System.in);
        x = myScanner.nextLine();
        StringTokenizer tokens = new StringTokenizer(x);
        while (tokens.hasMoreTokens())
        {
            String t = tokens.nextToken();
            s+=Integer.parseInt(t);
        }
        System.out.println("Sum of number is = " + s);
    }
}