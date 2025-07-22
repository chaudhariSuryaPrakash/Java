//write a program to enter marks of a student and declear result pass or fail if more than 40
import java.util.Scanner;
public class StudentResult{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    while (true) {
        System.out.print("Enter the marks of the student: ");
        int marks = scanner.nextInt();
        
        if (marks > 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    
        scanner.close();
    }
    }
}