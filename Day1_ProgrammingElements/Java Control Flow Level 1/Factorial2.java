import java.util.*;
public class Factorial2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        if(n>0){
            for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println(fact);
        }
        else{
            System.out.println("Not a natural number");
        }
        sc.close();
    }
}
