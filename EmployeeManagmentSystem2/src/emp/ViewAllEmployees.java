package emp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ViewAllEmployees {

    public void getAllEmployees() {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("files\\employee.txt"));
            String line = reader.readLine();
            if (line == null) {
                System.err.println("No Employee are present\n");
            }
            int count = 0;
            while (line != null) {
                count++;
                System.out.println("Employee " + count + " = " + line);
                line = reader.readLine();
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
