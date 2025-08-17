import java.util.Scanner;
public class avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");   
         int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
         System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        int avg = (num1+num2+num3)/2;
        System.out.println("Average"+avg);
        sc.close();
}
