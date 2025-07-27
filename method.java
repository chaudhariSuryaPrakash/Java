import java.util.Scanner;
class Computer{
    public void playMusic(){
        System.out.println("Playing music ...");
    }

    public String getMEAPen(int cost){
        return "Pen";
    }
}

class methodOverloading{
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public double add(double n1, int n2){
        return n1+n2;
    }
    public String add(String str1, String str2){
        return str1 + " " + str2;
    }
}

public class method{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
   System.out.println("Hello, World!");
        
        System.out.print("Enter the cost of the pen:");
        int cost = sc.nextInt();

        Computer obj = new Computer();
        methodOverloading obj1 = new methodOverloading();
        obj.playMusic();
        String Pen = obj.getMEAPen(cost);
        System.out.println("The pen is: " + Pen);


        int sum1 = obj1.add(10, 20);
        int sum2 = obj1.add(10, 20, 30);
        double sum3 = obj1.add(10.5, 20);
        String sum4 = obj1.add("Hello", "World");
        System.out.println("Sum of 10 and 20: " + sum1);
        System.out.println("Sum of 10, 20 and 30: " + sum2);
        System.out.println("Sum of 10.5 and 20: " + sum3);
        System.out.println("Concatenation of 'Hello' and 'World': " + sum4);


         sc.close();
    }

}