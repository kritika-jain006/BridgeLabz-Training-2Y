import java.util.*;


class InvalidMarksException extends Exception {
    InvalidMarksException(String msg) {
        super(msg);
    }
}


class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}
public class StudentResultSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("name");
            String n = sc.nextLine();
            if (n == null ||n=="")
             {
                throw new NullPointerException("Name cannot be null or empty");
            }

             int marks[] = new int[3];
            System.out.println("marks");
            for (int i =0;i<3;i++) {
                marks[i] = sc.nextInt();
                if (marks[i] < 0 || marks[i] > 100) {
                    throw new InvalidMarksException("Marks must be between 0 and 100");
                }
            }

            System.out.print("age: ");
            int age = sc.nextInt();
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above");
            }


            double avg = 0;
            try {
                int sum = 0;
                for (int m : marks)
                {
                    sum+=m;
                }
                avg = sum / marks.length;

                System.out.println(marks[3]);
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: invalid array index");
            } finally {
                System.out.println("Result processing completed.");
            }



        } 
        catch (NullPointerException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (InvalidMarksException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
