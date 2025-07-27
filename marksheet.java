import java.util.Scanner;
public class marksheet {
    public static void main(String[] args) {
        // create a program to accept student 5 sub marks and grade them usinf if else
        Scanner scanner = new Scanner(System.in);
        //make total marks an array which push each student details after user input
        int subjects = 5;
        int student = 0;
        System.out.println("Enter the number of students: ");
        student = scanner.nextInt();
        int[] totalMarks = new int[student]; // Array to store total marks for each student

        for(int i = 0; i<student; i++ ){
        int sum = 0;
            System.out.println("Enter marks for student " + i+1 + ": ");
        for (int j = 1; j <= subjects; j++) {
            System.out.print("Enter marks for subject " + j + ": ");
            int marks;
            do {
                marks = scanner.nextInt();
                if (marks < 0 || marks > 100) {
                    System.out.print("Invalid input. Enter marks (0-100): ");
                }
            } while (marks < 0 || marks > 100);
            sum += marks;
        } 
        totalMarks[i] = sum; // Store total marks for this student

        double percentage = (double) sum / subjects;
        if (percentage >= 90) {
            System.out.println("Grade: A++");
        }
        else if (percentage >= 80) {
            System.out.println("Grade: A+");
        } 
        else if (percentage >= 60) {
            System.out.println("Grade: A");
        } else if (percentage >= 50) {
            System.out.println("Grade: B");
        } else if (percentage >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }}
        // Print total marks for each student
        System.out.println("\nTotal marks for each student:");
        for (int i = 0; i < student; i++) {
            System.out.println("Student " + (i + 1) + ": " + totalMarks[i]+"/500");
        }

//         System.out.print("Enter a number to calculate sum of n natural numbers: ");
// int n = scanner.nextInt();
// int sum = 0;
// for (int i = 1; i <= n; i++) {
//     sum += i;
// }
// System.out.println("Sum of first " + n + " natural numbers is: " + sum);

        scanner.close();
    }
}





