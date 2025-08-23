import java.util.* ;
public class ComputeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n >= 1) {
            int s = n* (n+ 1) / 2;
            int sLoop = 0;
            for (int i = 1; i <= n; i++) {
                sLoop += i;
            }

            if (s== sLoop) {
                System.out.println("Computations are correct and equal.");
            } else {
                System.out.println("Computations are not equal.");
            }
        } else {
            System.out.println("The number " +n+ " is not a natural number");
        }
        sc.close();

    }

}