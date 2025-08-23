import java.util.*; 
public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        
        for (int i=c; i>=1; i--) {
            System.out.println(i);
        }
        
        System.out.println("Rocket Launched!");
        sc.close();
    }
}
