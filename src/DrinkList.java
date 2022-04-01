import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DrinkList {
    // List of beverage
    private ArrayList<Drink> _list = new ArrayList<Drink>();  
    
    // Load the list from a file.
    public void load() {
        Scanner reader = null;
        try {
            File fileDescriptor = new File("drink_list.txt");
            reader = new Scanner(fileDescriptor);

            while (reader.hasNext()) {
                String record = reader.nextLine();
                // Now split the string and parse each field
                String[] fields = record.split(",");
                int id = Integer.parseInt(fields[0]);
                String name = fields[1];
                double price = Double.parseDouble(fields[2]);

                // Create a new object for each record
                Drink obj = new Drink(id, name,price);
                _list.add(obj);    // Add object to list
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();  // You should add proper error reporting & recovery code here!
        }
        finally {
            if (reader != null) {
                reader.close();
            }
        }
    }

    // Save the list to a file.
    public void save() {
        PrintWriter writer = null;
        try {
            File fileDescriptor = new File("drink_list.txt");
            writer = new PrintWriter(fileDescriptor);
            for (int index = 0; index < _list.size(); index++) {
                Drink dr = _list.get(index);
                writer.println(dr.getDrinkID() + "," +
                               dr.getDrinkName()+ "," +
                               dr.getDrinkPrice());
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace(); // Add error recovery here if needed
        }
        finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
    // Get a list item
    public Drink getDrink(int index) {
        return _list.get(index);
    }

    // Get the number of drinks in the list
    public int getSize() {
        return _list.size();
    }
}
