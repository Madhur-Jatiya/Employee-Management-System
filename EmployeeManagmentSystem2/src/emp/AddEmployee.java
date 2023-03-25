package emp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddEmployee {

    Employee emp = new Employee();
    BufferedWriter writer;
    Scanner sc = new Scanner(System.in);

    public void addNewEmployees() throws IOException {
        try {
            writer = new BufferedWriter(new FileWriter("files\\employee.txt", true));

        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.print("\nEnter Name = ");
        emp.setName(sc.nextLine());

        System.out.print("Enter Age = ");
        emp.setAge(sc.nextInt());

        System.out.print("Enter Email = ");
        emp.setEmailId(sc.next());

        System.out.print("Enter Mobile = ");
        emp.setMobileNumber(sc.next());

        System.out.print("Enter Salary = ");
        emp.setSalary(sc.nextDouble());

        writer.write(emp.toString());
        writer.newLine();
        writer.close();
    }
}
