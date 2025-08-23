import java.util.*;
public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s = sc.nextDouble();
        double y = sc.nextDouble();
        if(y>5){
            double b = 0.5*s;
            System.out.println("Bonus ampount: "+b);
        }
        System.out.println("no bonus");
    }
}
