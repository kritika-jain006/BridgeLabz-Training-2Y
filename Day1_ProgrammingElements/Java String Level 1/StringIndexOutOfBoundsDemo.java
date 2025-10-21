import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    static String userInput;
    public static void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        userInput = scanner.nextLine();
    }


    public static void generateException() {
        System.out.println("Character at index 100: " + userInput.charAt(100));
    }

    public static void handleException() {
        try {
            System.out.println("Character at index 100: " + userInput.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException!");
            System.out.println("Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        getUserInput();

        // generateException();


        handleException();
    }
}
