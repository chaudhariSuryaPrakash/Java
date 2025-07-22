
    import java.util.Scanner;

class input {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
    	
        System.out.print("Enter the first no: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        System.out.println("You entered " + number2);

        // closing the scanner object
        input.close();
    }
}

