import java.util.Scanner;
public class Height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double heightCm = sc.nextDouble();
        double heightInches = heightCm / 2.54; 
        int feet = (int) (heightInches / 12);
        double inches = heightInches % 12;

        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f%n", heightCm, feet, inches);
        sc.close();
    }
}
