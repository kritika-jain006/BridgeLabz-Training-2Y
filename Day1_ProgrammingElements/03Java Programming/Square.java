import java.util.Scanner;   
public class Square{ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int perimeter = 4 * x;
        System.out.println("The length of the side is "+x+"whose perimeter is "+perimeter);
        sc.close();
    }
}