import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number < 1) {
            System.out.println("Error: Please enter a natural number (>= 1).");
            return;
        }

        int[] even = new int[number / 2 + 1];
        int[] odd = new int[number / 2 + 1];
        int evenIdx = 0, oddIdx = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIdx++] = i;
            } else {
                odd[oddIdx++] = i;
            }
        }

        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIdx; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();

        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIdx; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();
    }
}
