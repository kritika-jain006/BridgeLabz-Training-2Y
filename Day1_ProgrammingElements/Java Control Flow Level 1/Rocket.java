import java.util.*; 
public class Rocket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        
        while (c>= 1) {
            System.out.println(c);
            c--;
        }
        
        System.out.println("Rocket Launched!");
        sc.close();
    }
}
