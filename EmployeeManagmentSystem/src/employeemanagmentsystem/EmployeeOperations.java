package employeemanagmentsystem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EmployeeOperations {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        BufferedWriter writer = null;

        while (true) {
            try {
                writer = new BufferedWriter(new FileWriter("files\\employee.txt", true));

            } catch (IOException e) {
                System.out.println(e);
            }

            System.out.print("Enter First Name (or quit for exit) = ");
            String fname = sc.next();
            if (fname.equalsIgnoreCase("quit")) {
                break;
            }

            System.out.print("Enter Last Name = ");
            String lname = sc.next();

            String name = fname + " " + lname;
            emp.setName(name);

            System.out.print("Enter Age = ");
            emp.setAge(sc.nextInt());

            System.out.print("Enter Email = ");
            emp.setEmailId(sc.next());

            System.out.print("Enter Mobile = ");
            emp.setMobileNumber(sc.next());

            System.out.print("Enter Salary = ");
            emp.setSalary(sc.nextDouble());

            writer.write(emp.toString() + "\n \n");
            writer.close();
            System.out.println("\n" + emp + "\n");

        }

        System.out.println("\n All Employee data are successfully written to file.");
    }

}
