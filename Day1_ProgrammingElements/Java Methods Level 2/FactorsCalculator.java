import java.util.Scanner;

public class FactorsCalculator {

    public static int[] findFactors(int num) {
        int count = 0;
        
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;

       
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

   
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int n : arr) sum += n;
        return sum;
    }

    public static long findProduct(int[] arr) {
        long product = 1;
        for (int n : arr) product *= n;
        return product;
    }

    
    public static double findSumOfSquares(int[] arr) {
        double sum = 0;
        for (int n : arr) sum += Math.pow(n, 2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = findFactors(num);

        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println();

        int sum = findSum(factors);
        long product = findProduct(factors);
        double sumSquares = findSumOfSquares(factors);

        System.out.println("Sum of factors: " + sum);
        System.out.println("Sum of squares of factors: " + sumSquares);
        System.out.println("Product of factors: " + product);
    }
}
