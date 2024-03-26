
//Simple Java Console Calculator. it contain addition, substraction, multipliction and division.
import java.util.Scanner; // Import the Scanner class

public class App {
    // Add method
    public void add(int a, int b) {
        System.out.println("-".repeat(50));
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    // Substract method
    public void sub(int a, int b) {
        System.out.println("-".repeat(50));
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    // Multiply method
    public void mul(int a, int b) {
        System.out.println("-".repeat(50));
        System.out.println(a + " * " + b + " = " + (a * b));
    }

    // Divide method
    public void div(int a, int b) {
        System.out.println("-".repeat(50));
        System.out.println(a + " / " + b + " = " + (a / b));
    }

    // Power method
    public void pow(int a, int b) {
        System.out.println("-".repeat(50));
        System.out.println(a + " ^ " + b + " = " + Math.pow(a, b));
    }

    // Squareroot method
    public void sqrt(float a) {
        System.out.println("-".repeat(50));
        System.out.println("Second Number is Ignored");
        System.out.println("Square Root of " + a + " = " + Math.sqrt(a));
    }

    // Reminder method
    public void rem(int a, int b) {
        System.out.println("-".repeat(50));
        System.out.println(a + " % " + b + " = " + (a % b));
    }

    // Get Input For Choice
    public int getChoice() {
        Scanner input = new Scanner(System.in); // Create a Scanner object
        System.out.println("=".repeat(50));
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Power");
        System.out.println("6. Square Root");
        System.out.println("7. Reminder");
        System.out.println("8. Exit");
        System.out.print("Enter Your Choice: ");
        int choice = input.nextInt(); // Read user input
        if (choice < 1 || choice > 7) {
            System.out.println("Invalid Choice");
            return getChoice();
        } else {
            return choice;
        }
    }

    public static void main(String[] args) {
        App obj = new App();
        Scanner input = new Scanner(System.in); // Create a Scanner object
        int a, b;
        while (true) {
            int choice = obj.getChoice();
            if (choice == 8) {
                break;
            }
            System.out.print("Enter First Number: ");
            a = input.nextInt(); // Read user input
            System.out.print("Enter Second Number: ");
            b = input.nextInt(); // Read user input
            switch (choice) {
                case 1:
                    obj.add(a, b);
                    break;
                case 2:
                    obj.sub(a, b);
                    break;
                case 3:
                    obj.mul(a, b);
                    break;
                case 4:
                    obj.div(a, b);
                    break;
                case 5:
                    obj.pow(a, b);
                    break;
                case 6:
                    obj.sqrt(a);
                    break;
                case 7:
                    obj.rem(a, b);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}