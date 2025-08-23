import java.util.*;
public class Compute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n >= 1) {
            int s = n* (n+ 1) / 2;
            int sLoop = 0;
            int i = 1;
            while (i <= n) {
                sLoop += i;
                i++;
            }

            if (s== sLoop) {
                System.out.println("Computations are correct and equal.");
            } else {
                System.out.println("Computations are not equal.");
            }
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
        
        sc.close();
    }
}
