import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double baseInches = sc.nextDouble();
        double heightInches = sc.nextDouble();
        
        double areaInches = 0.5 * baseInches * heightInches;
        double areaCm2 = areaInches * 6.4516; 
        System.out.printf("The area of the triangle is %.2f square inches or %.2f square centimeters.%n", areaInches, areaCm2);
        
        sc.close();
    }
}
