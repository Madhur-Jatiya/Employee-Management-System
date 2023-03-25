package emp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UpdateEmployee {

    Scanner sc = new Scanner(System.in);

    public void editEmployee() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("files\\employee.txt"));
            String line = reader.readLine();
            if (line == null) {
                System.err.println("No Employee are present\n");
            }
            System.out.print("\n Enter Employee Number = ");
            int empNo = sc.nextInt();
            sc.nextLine();
            System.out.println();

            while (line != null) {
                list.add(line);
                line = reader.readLine();
            }

            String parts[] = list.get(empNo - 1).split(", ");
            System.out.println("Employee " + empNo + " = " + list.get(empNo - 1) + "\n");

            System.out.println("1. Edit Name");
            System.out.println("2. Edit Mobile Number");
            System.out.println("3. Edit Email");
            System.out.println("4. Edit Age");
            System.out.println("5. Edit Salary");

            System.out.print("Enter = ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("New Name = ");
                    parts[0] = sc.nextLine();
                    break;
                case 2:
                    System.out.print("New Mobile Number = ");
                    parts[1] = sc.next();
                    break;
                case 3:
                    System.out.print("New Email = ");
                    parts[2] = sc.next();
                    break;
                case 4:
                    System.out.print("New Age = ");
                    parts[3] = Integer.toString(sc.nextInt());
                    break;
                case 5:
                    System.out.print("New Salary = ");
                    parts[4] = Double.toString(sc.nextDouble());
                    break;
                default:
                    System.err.println("\n Invalid choice. Please try again.\n");
                    return;
            }

            list.set(empNo - 1, String.join(", ", parts));

            BufferedWriter writer = new BufferedWriter(new FileWriter("files\\employee.txt"));
            for (String employee : list) {
                writer.write(employee);
                writer.newLine();
            }
            writer.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }
}
