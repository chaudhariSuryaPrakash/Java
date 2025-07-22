import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create scanner object

        // System.out.print("Enter Priciple no: ");
        // int Principal = sc.nextInt();  // For strings (including spaces)

        // System.out.print("Enter time no: ");
        // int time = sc.nextInt();  // For integers

        // System.out.print("Enter Rate no: ");
        // int rate = sc.nextInt();  // For integers
        
        // int interest = (Principal*time*rate)/100;

        // System.out.println(interest);

// while(true){
//         System.out.print("Enter your no: ");
//         int num1 = sc.nextInt();

//         if (num1 % 2 == 0) {
//             System.out.println(num1 + " is Even");
//         } else {
//             System.out.println(num1 + " is Odd");
//         }}
  
int marks1 = 1;
while(marks1 != 0) {
        
        System.out.print("Enter your no: ");
         marks1 = sc.nextInt();

        String result = (marks1>40 ? "Pass" : "Fail");
        System.out.println(result);
}
        sc.close();
    }
}
