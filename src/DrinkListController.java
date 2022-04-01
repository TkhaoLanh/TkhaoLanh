import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class DrinkListController {
    private DrinkList _list = MenuController._list;  // A reference to the list of drinks

    @FXML private TextArea txtList;
    @FXML private Button btnBack;

    // Initializes the controller class. This method is automatically called after the FXML file has been loaded.
    @FXML private void initialize() {
        // Show the list of drinks
        String display = "";
        for (int index = 0; index < _list.getSize(); index++) {
            display += _list.getDrink(index);
            display += "\n";     // Go to the next line
        }
        txtList.setText(display);
    }
    
}
