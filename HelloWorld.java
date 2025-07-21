public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int x = 3;
        int y = 4;
        System.out.println("Before swapping:");
        System.out.println("x" + " = " + x);
        System.out.println("y" + " = " + y);
        int sum;
        // sum = x + y; // Calculate the sum of x and y
        sum = x;
        x= y;
        y = sum;
        
        System.out.println("After swapping:");
        System.out.println("x" + " = " + x);
        System.out.println("y" + " = " + y);
        System.out.println("The sum of " + x + " and " + y + " is: "  +sum);
    }
}