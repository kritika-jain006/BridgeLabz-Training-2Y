import java.util.Scanner;
public class StudentFee {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double fees= sc.nextDouble();
    double discountPrecent = sc.nextDouble();
    double discountAmount = (fees * discountPrecent) / 100;
    double finalFees = fees - discountAmount;
    System.out.println("The discount amount is INR " + discountAmount + " and the final fee is INR " + finalFees + ".");
    sc.close();
}
}   