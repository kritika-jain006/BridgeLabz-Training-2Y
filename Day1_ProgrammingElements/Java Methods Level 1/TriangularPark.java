import java.util.Scanner;

public class TriangularPark {
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double totalDistance = 5000;
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 (in meters): ");
        double a = sc.nextDouble();
        System.out.print("Enter side 2 (in meters): ");
        double b = sc.nextDouble();
        System.out.print("Enter side 3 (in meters): ");
        double c = sc.nextDouble();

        double rounds = calculateRounds(a, b, c);
        System.out.printf("The athlete must complete %.2f rounds to finish 5 km.\n", rounds);
    }
}
