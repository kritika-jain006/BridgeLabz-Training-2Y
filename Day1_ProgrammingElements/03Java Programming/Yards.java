import java.util.Scanner;
public class Yards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distanceInFeet = sc.nextInt();
        
        double yards = distanceInFeet / 3.0;
        double miles = yards / 1760.0;
        
        System.out.printf("Distance in yards: %.2f, Distance in miles: %.6f%n", yards, miles);
        
        sc.close();

    }
}
