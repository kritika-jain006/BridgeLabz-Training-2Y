import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Isarmstrong(n));
        sc.close();
    }
    public static int count_of_digit(int n){
        int c=0;
        while(n>0){
            c++;
            n=n/10;

        }
        return c;
    }
    public static boolean Isarmstrong(int n){
        int c=count_of_digit(n);
        int sum=0;
        int temp=n;
        while(temp>0){
            int digit=temp%10;
            sum+=Math.pow(digit,c);
            temp=temp/10;
        }
        return sum==n;
    }
}