import java.util.Scanner;

public class Example 
{
    public static void main(String[] args) {
    //     Example ex = new Example();
    //     ex.show();
    // }
   

    // public void show() 
    // {
        Scanner sc = new Scanner(System.in);
    //     int number = scanner.nextInt();
    //     if (number > 0) 
    //     {
    //         System.out.println("The number is positive.");
    //     }
    //     else if (number < 0)
    //     {
    //         System.out.println("The number is negative.");
    //     } 
    //     else 
    //     {
    //         System.out.println("The number is zero.");
    //     }
    while(true){
        System.out.print("Enter your no: ");
        int num1 = sc.nextInt();

        if (num1 % 2 == 0) {
            System.out.println(num1 + " is Even");
        } else {
            System.out.println(num1 + " is Odd");
        }}
    }
}