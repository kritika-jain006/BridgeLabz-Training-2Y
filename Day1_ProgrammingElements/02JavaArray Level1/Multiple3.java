import java.util.Scanner;

public class Multiple3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number < 6 || number > 9) {
            System.out.println("Please enter a number between 6 and 9.");
            return;
        }

        int[] multiplicationResult = new int[10];
        for (int i = 1; i <= 10; i++) {
            multiplicationResult[i - 1] = number * i;
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 1]);
        }
    }
}
