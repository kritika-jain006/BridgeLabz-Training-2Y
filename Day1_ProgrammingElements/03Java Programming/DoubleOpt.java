import java.util.Scanner;
public class DoubleOpt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double value1 = sc.nextDouble();
        double value2 = sc.nextDouble();
        double addition = value1 + value2;
        double subtraction = value1 - value2;
        double multiplication = value1 * value2;
        double division = value1 / value2;
        System.out.printf("The addition, subtraction, multiplication and division value of 2 double values %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f%n", 
                          value1, value2, addition, subtraction, multiplication, division);
    }
}
