import java.util.Scanner;

public class StringToCharArrayComparison {

    public static char[] getChars(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[] userDefinedChars = getChars(text);
        char[] builtInChars = text.toCharArray();

        System.out.println("User-defined char array: " + java.util.Arrays.toString(userDefinedChars));
        System.out.println("Built-in toCharArray(): " + java.util.Arrays.toString(builtInChars));

        boolean isSame = compareCharArrays(userDefinedChars, builtInChars);
        System.out.println("Are both arrays equal? " + isSame);
    }
}
