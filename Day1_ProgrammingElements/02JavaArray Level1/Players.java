import java.util.Scanner;

public class Players {
    public static void main(String[] args) {
        double[] heights = new double[11];
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        double mean = sum / heights.length;
        System.out.printf("Mean height of the football team: %.2f\n", mean);
        sc.close();
    }
}
