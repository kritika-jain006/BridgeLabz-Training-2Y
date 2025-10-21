import java.util.Scanner;

public class CustomStringLength {

    public static int customLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);  
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            
        }
        return count;
    }
}
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                System.out.print("Enter a string (no spaces): ");
        String input = scanner.next();

    
        int lengthCustom = customLength(input);
        int lengthBuiltIn = input.length();

       System.out.println("\nCustom length (without using length()): " + lengthCustom);
        System.out.println("Built-in length(): " + lengthBuiltIn);
    }

