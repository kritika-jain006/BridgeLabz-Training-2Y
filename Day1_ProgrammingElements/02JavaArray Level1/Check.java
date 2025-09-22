import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            System.out.print("Element " + (i + 1) + " (" + num + "): ");
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println("Positive and Even");
                } else {
                    System.out.println("Positive and Odd");
                }
            } else if (num < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        }

        System.out.print("First element (" + arr[0] + ") and Last element (" + arr[4] + "): ");
        if (arr[0] == arr[4]) {
            System.out.println("Equal");
        } else if (arr[0] > arr[4]) {
            System.out.println("First is Greater");
        } else {
            System.out.println("First is Less");
        }
    }
}
