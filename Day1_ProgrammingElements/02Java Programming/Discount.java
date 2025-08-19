public class Discount {
    public static void main(String[] args) {
        double courseFee = 125000.0;
        double discountRate = 0.10; 
        double discountAmount = courseFee * discountRate;
        double discountedPrice = courseFee - discountAmount;
        System.out.println( "The discount amount is INR"+discountAmount+" and final discounted fee is INR "+ discountedPrice + "."
    );
       
    }
}
