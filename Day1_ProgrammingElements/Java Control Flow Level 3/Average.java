import java.util.*;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks for Physics: ");
        int physics = sc.nextInt();

        System.out.print("Enter marks for Chemistry: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter marks for Maths: ");
        int maths = sc.nextInt();

        int total = physics + chemistry + maths;
        double average = total / 3.0;
        double percentage = (total / 300.0) * 100;

        String grade, remarks;
        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4,above agency-normalized standards";
        } else if (percentage >= 70 && percentage<80)  {
            grade = "B";
            remarks = "Level 3,at agency-normalized standards";
        } else if (percentage >= 60 && percentage<70) {
            grade = "C";
            remarks = "Level 2,below but approaching agency-normalized standards";
        } else if (percentage >= 50 && percentage<60) {
            grade = "D";
            remarks = "Level 1,well below agency-normalized standards";
        } else if(percentage>=40 && percentage<50){
            grade = "E";
            remarks = "Level 1,too below agency-normalized standards";
        }
        else{
            grade = "R";
            remarks = "Remedial standards";
        }

        System.out.printf("Average Mark: %.2f\n", average);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        sc.close();
    }
}
