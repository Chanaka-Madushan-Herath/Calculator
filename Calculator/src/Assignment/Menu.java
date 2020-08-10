package Assignment;

import java.util.Scanner;

import static java.lang.System.exit;

public class Menu extends Operations {
    public void operation_menu(){

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
                Add_numbers();
                break;
            case "2":
                subtract_numbers();
                break;
            case "3":
                multypy_numbers();
                break;
            case "4":
                divide_numbers();
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
