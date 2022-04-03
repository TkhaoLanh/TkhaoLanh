import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
//import javafx.scene.image.Image;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class DrinkListController {
    private DrinkList _list = MenuController._list;  // A reference to the list of drinks
    static Drink selectedDrink;
    @FXML private TextField txt1;
    @FXML private TextField txt2;
    @FXML private TextField txt3;
    @FXML private Button btnBack;
    @FXML private Label label1;
    /*
    @FXML private ImageView img1;
    @FXML private ImageView img2;
    @FXML private ImageView img3;*/

    // Initializes the controller class. This method is automatically called after the FXML file has been loaded.
    @FXML private void initialize() {
        // Show the list of drinks

        txt1.setText(""+_list.getDrink(0).getDrinkName());
        label1.setText(""+_list.getDrink(0).getDrinkPrice());
        txt2.setText(""+_list.getDrink(1).getDrinkName());
        txt3.setText(""+_list.getDrink(2).getDrinkName());

        // Image image1 = new Image(_list.getDrink(0).getImagePath());
        // img1.setImage(image1);

        // Image image2 = new Image(_list.getDrink(1).getImagePath());
        // img2.setImage(image2);
        
        // Image image3 = new Image(_list.getDrink(2).getImagePath());
        // img3.setImage(image3);

        txt1.setOnMouseClicked(e -> onText1Clicked());
    }
    private void onText1Clicked(){
        // Open the DrinkList window (stage)
        try {
            // load(_list.getDrink(0))
            selectedDrink = _list.getDrink(0);
            Parent root = (AnchorPane)FXMLLoader.load(getClass().getResource("DrinksDetails.fxml"));
            Scene scene = new Scene(root);
            
            Stage secondStage = new Stage();
            secondStage.setScene(scene);
            secondStage.initModality(Modality.APPLICATION_MODAL);  // Use this so you have to close the 2nd window to return to main window
            secondStage.showAndWait();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    
}
