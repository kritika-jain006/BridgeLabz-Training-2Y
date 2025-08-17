import java.util.Scanner;
public class peri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();
        double p = 2*(l+b);
        System.out.println("Perimeter of rectangle is: " + p);
        sc.close();

    }
}
