import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        // Input marks
        System.out.println("-----Student Grade Tracker-----");
        System.out.println(" ");

        System.out.println("Enter student grades: (If you finished entering marks, please type '-1' to exit):");
        System.out.println(" ");

        while (true) {
            System.out.print("Enter grade: ");
            int grade = scanner.nextInt();

            if (grade == -1) {
                break;
            } else if (grade < 0 || grade > 100) {
                System.out.println("Please enter a valid grade between 0 and 100.");
            } else {
                grades.add(grade);
            }
        }

        // Find the highest and lowest marks
        if (grades.size() > 0) {
            int sum = 0;
            int highest = grades.get(0);
            int lowest = grades.get(0);

            for (int grade : grades) {
                sum += grade;
                if (grade > highest) {
                    highest = grade;
                }
                if (grade < lowest) {
                    lowest = grade;
                }
            }

            // Find average
            double average = (double) sum / grades.size();

            // Print outputs
            System.out.println("\n-----Grade Summary-----");
            System.out.println(" ");
            System.out.println("The Average marks: " + average);
            System.out.println("The Highest marks: " + highest);
            System.out.println("The Lowest marks: " + lowest);
        } else {
            System.out.println("No grades were entered.");
        }

        scanner.close();
    }
}

