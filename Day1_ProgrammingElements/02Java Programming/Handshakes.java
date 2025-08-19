import java.util.Scanner;
public class Handshakes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int handshakes = (n * (n- 1)) / 2;
        
        System.out.printf("The maximum number of handshakes among %d students is %d%n", n, handshakes);
        
        sc.close();
    }
}
