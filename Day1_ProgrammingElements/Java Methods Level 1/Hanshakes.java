import java.util.Scanner;

public class Hanshakes {
    
    public static long calculateHandshakes(long n) {
        long students = Math.max(0, n);
        return students * (students - 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        while (!scanner.hasNextLong()) {
            System.out.print("Invalid input. Enter an integer for number of students: ");
            scanner.next();
        }
        long numberOfStudents = scanner.nextLong();
        long handshakes = calculateHandshakes(numberOfStudents);
        System.out.println("Maximum number of handshakes: " + handshakes);
        scanner.close();
    }
}

