import java.util.Scanner;

public class Exampler 
{
    private int number;

    public void takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        scanner.close();
    }

    public void show() 
    {
        if (number > 0) 
        {
            System.out.println("The number is positive.");
        }
        else if (number < 0)
        {
            System.out.println("The number is negative.");
        } 
        else 
        {
            System.out.println("The number is zero.");
        }
    }

    public static void main(String[] args) {
        Exampler ex = new Exampler();
        ex.takeInput();
        ex.show();
    }
}