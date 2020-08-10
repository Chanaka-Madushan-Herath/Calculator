package Assignment;

import java.util.Scanner;

import static java.lang.System.exit;

public class Menu {
    public void operation_menu(){
        Sum sum = new Sum();
        Subtract subtract = new Subtract();
        Multipy multipy = new Multipy();
        Divide divide = new Divide();

        System.out.println("Please select,");
        System.out.println("    1. ADDITION ");
        System.out.println("    2. SUBTRACTION ");
        System.out.println("    3. MULTIPLICATION");
        System.out.println("    4. DIVISION");
        System.out.println("    5. EXIT");

        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        switch (choice) {
            case "1":
                sum.Add_numbers();
                break;
            case "2":
                subtract.subtract_numbers();
                break;
            case "3":
                multipy.multypy_numbers();
                break;
            case "4":
                divide.divide_numbers();
                break;
            case "5":
                System.out.println("Bye...!");
                exit(0);
            default:
                System.out.println("Wrong Choice...");
                break;
        }
        operation_menu();
    }
}
