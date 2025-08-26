import java.util.*;
public class Library {
     static void displayBookInfo(String title, String author, String id, boolean isAvailable) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Book ID: " + id);
            if(isAvailable) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

         static double calculateAverageRating(int[] arr) {
            int sum = 0;
            for (int r : arr) {
                sum += r;
            }
            double i = (double) sum/arr.length;
            return i;
        }
        static void compareAuthorNames(String a1, String a2) {
            System.out.print("Comparing with 'Shakespeare'-->");
            if (a1.equals(a2)) {
                System.out.println("Same authors.");
            } else {
                System.out.println("Different authors.");
            }
        }
         static int calculateTotalRatings(int[] ratings) {
            return ratings.length;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();
        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();
        System.out.print("Enter Book ID: ");
        String bookID = sc.nextLine();
        System.out.print("Is book available (true/false): ");
        boolean av = sc.nextBoolean();
        System.out.print("Enter number of ratings: ");
        int n = sc.nextInt(); 
        int ratings[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter ratings "+(i+1)+": ");
            ratings[i] = sc.nextInt();
        }
        if (n == 0) {
            System.out.println("No ratings available!");
            
        }
        displayBookInfo(title, author, bookID, av);
        System.out.println("Author Name Length: " + author.length());

        compareAuthorNames(author, "Shakespeare");

         for (int i = 0; i < ratings.length; i++) {
            System.out.println("Rating"+(i+1)+"->" + ratings[i]);
        }
        for(int r:ratings){
            if (r == 1) {
                System.out.println("One user gave a poor rating!");
            }
        }
        System.out.println("Total Ratings: " + calculateTotalRatings(ratings));


        double avg = calculateAverageRating(ratings);
        System.out.println("Average Rating: " + avg);
        System.out.print("Book Status: ");
        if (avg >= 4) {
            System.out.println("Highly Rated Book!");
        } else {
            System.out.println("Average Book");
        }


        sc.close();
    }
    
    }
