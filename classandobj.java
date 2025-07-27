import java.util.Scanner;

class calculator{

        public int add(int n1, int n2){
            int sum = n1 + n2;
            return sum;
        }

        public int subtract(int n1, int n2){
            return n1 - n2;
        }

        public int multiply(int n1, int n2){
            return n1 * n2;
        }

        public int divide(int n1, int n2){
            if(n2 == 0){
                System.out.println("Cannot divide by zero");
                return 0;
            }
            return n1 / n2;
        }
    }

    class car{
        String brand;
        int speed;
        int speedLimit; // Default speed limit

        car(String brand, int speed){
            this.brand = brand;
            this.speed = speed;
        }

        public void displayDetails(int speedLimits){
            this.speedLimit = speedLimits;
            System.out.println("Car Brand: " + brand);
            System.out.println("Car Speed: " + speed + " km/h");
            System.out.println("Speed Limit: " + speedLimit + " km/h");
        }

    }

    class Rectangle{
        int length;
        int breadth;

        Rectangle(int length, int breadth){
            this.length = length;
            this.breadth = breadth;
        }

        public int area(){
            return length * breadth;
        }

    }

    class Employee {
        String name;
        int id;

        Employee(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public void display() {
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + id);
        }
    }

    class OverloadedPrinter {
        public void print(String message) {
            System.out.println("String: " + message);
        }

        public void print(int number) {
            System.out.println("Integer: " + number);
        }

        public void print(double decimal) {
            System.out.println("Double: " + decimal);
        }
    }

    class BankAccount{

        private double balance;

        public BankAccount(double initialBalance) {
            this.balance = initialBalance;
        }

        public void deposit(double amount){
            if(amount > 0){
                balance += amount;
                System.out.println("Deposited: " + amount);
                System.out.println("New Balance: " + balance);
            } else {
                System.out.println("Deposit amount must be positive.");
                // Handle invalid deposit case
                // You can throw an exception or return an error code
                // throw new IllegalArgumentException("Invalid deposit amount");

            }
        }

        public void withdraw(double amount){
            if(amount > 0 && amount <= balance){
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
                System.out.println("New Balance: " + balance);
            } else {
                System.out.println("Invalid withdrawal amount.");
                // Handle invalid withdrawal case
                // You can throw an exception or return an error code
                // throw new IllegalArgumentException("Invalid withdrawal amount");
            }

        }
    }

    class thisKeywordExample {
        private int value;

        public thisKeywordExample(int value) {
            this.value = value; // 'this' refers to the current object's field
        }

        public void displayValue() {
            System.out.println("Value: " + this.value); // 'this' is optional here
        }
    }

    class StaticExample {
        private static int objectCount = 0; // Static variable to track object count

        public StaticExample() {
            objectCount++;
        }

        public static int getObjectCount() {
            return objectCount; // Static method to access static variable
        }
    }
//    Beginner:

// Create a class Car with properties brand and speed. Add a method to print details.

// Create a Calculator class with add, subtract, multiply, divide methods.

// Create a class Rectangle with length & breadth. Add method to return area.

// Intermediate:
// 4. Create a class Employee with constructor and display() method.
// 5. Implement method overloading for print(String), print(int), and print(double).

// Advanced:
// 6. Create a BankAccount class with deposit and withdraw methods. Show balance update.
// 7. Use this keyword to refer to current object.
// 8. Add static methods and variables to track object count


public class classandobj {

public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the First number:");
   int num1 = sc.nextInt();
   System.out.print("Enter the Second number:");
   int num2 = sc.nextInt();
   calculator obj1 = new calculator();
   int result = obj1.add(num1, num2);
   System.out.println("The sum is " + result);

    System.out.print("Enter the car brand: ");  
    String brand = sc.next();
    System.out.print("Enter the car speed: ");  
    int speed = sc.nextInt();
    car myCar = new car(brand, speed);
    myCar.displayDetails(120);
    System.out.println("Enter the length of the rectangle: ");
    int length = sc.nextInt();
    System.out.println("Enter the breadth of the rectangle: ");
    int breadth = sc.nextInt();
    Rectangle rect = new Rectangle(length, breadth);
    int area =rect.area();
    System.out.println("The area of the rectangle is: " + area);

    OverloadedPrinter printer = new OverloadedPrinter();
    printer.print("Hello, World!");
    printer.print(42);
    printer.print(3.14);

    Employee emp = new Employee("John Doe", 12345);
    emp.display();  

    BankAccount account = new BankAccount(1000.0);
    account.deposit(500.0); 
    account.withdraw(200.0);
    account.withdraw(1500.0); // This should trigger an error message
    account.deposit(-100.0); // This should also trigger an error message

    thisKeywordExample obj = new thisKeywordExample(10);
    obj.displayValue();     
    StaticExample stat1 = new StaticExample();
    StaticExample stat2 = new StaticExample();
    
    System.out.println("Total objects created: " + StaticExample.getObjectCount());
    System.out.println("End of Class and Object Operations");
    // Close the scanner to avoid resource leaks
    sc.close();
}
}
