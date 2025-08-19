import java.util.Scanner;
public class Quotient {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
         System.out.print("Enter the first number: ");
         int a = sc.nextInt();
            System.out.print("Enter the second number: ");
            int b = sc.nextInt();
            int quotient = a / b;
            int remainder = a % b;
           System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers " + a + " and " + b);
            sc.close();
    }
}
