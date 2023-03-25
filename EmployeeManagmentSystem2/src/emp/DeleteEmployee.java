package emp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DeleteEmployee {

    BufferedWriter writer;
    Scanner sc = new Scanner(System.in);

    public void deleteEmployee() throws IOException {
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

            list.remove(empNo - 1);
            writer = new BufferedWriter(new FileWriter("files\\employee.txt"));
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
