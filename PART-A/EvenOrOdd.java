import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int x = myScanner.nextInt();
        System.out.println("Number is " + (x%2 == 0 ? "Even" : "Odd"));
        myScanner.close();
    }
}
