import java.util.Scanner;
public class kilo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double k = sc.nextDouble();
        double m= k * 0.621371;
        System.out.println("Kilometers to Miles: " + m );
        sc.close();
    }   
}
