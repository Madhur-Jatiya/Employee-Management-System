package emp;

import java.io.IOException;
import java.util.Scanner;

public class Operation {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.err.println("\t\tWelcome to Employee Management System \n\n");
        while (true) {

            System.out.println("1. View all employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit an employee");
            System.out.println("4. Delete an employee");
            System.out.println("5. Quit");

            System.out.print("Enter = ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.err.println("\n\t\t List of all employees \n");
                    ViewAllEmployees view = new ViewAllEmployees();
                    view.getAllEmployees();
                    break;
                case 2:
                    AddEmployee add = new AddEmployee();
                    add.addNewEmployees();
                    System.err.println("\n\t\tNew Employees added successfully\n");
                    break;
                case 3:
                    UpdateEmployee update = new UpdateEmployee();
                    update.editEmployee();
                    System.err.println("\n\t\tEmployee information updated successfully\n");
                    break;
                case 4:
                    DeleteEmployee delete = new DeleteEmployee();
                    delete.deleteEmployee();
                    System.err.println("\n\t\tEmployee Deleted\n");
                    break;
                case 5:
                    System.err.println("\n\t\t Thanks for visit Employee Management System");
                    return;
                default:
                    System.err.println("\n Invalid choice. Please try again.\n");
                    break;
            }
        }

    }
}
