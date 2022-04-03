import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class DrinksDetailsController {
    private Drink selected = DrinkListController.selectedDrink;
    // Initializes the controller class. This method is automatically called after the FXML file has been loaded.
    @FXML private TextField txtName;
    @FXML private void initialize() {
        txtName.setText(""+selected.getDrinkName());
    }
}