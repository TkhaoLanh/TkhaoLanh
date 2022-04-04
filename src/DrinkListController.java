import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
    @FXML private Label labelName1;
    @FXML private Label labelName2;
    @FXML private Label labelName3;
    @FXML private Button btnBack;
    @FXML private Label labelPrice1;
    @FXML private Label labelPrice2;
    @FXML private Label labelPrice3;
    /*
    @FXML private ImageView img1;
    @FXML private ImageView img2;
    @FXML private ImageView img3;*/

    // Initializes the controller class. This method is automatically called after the FXML file has been loaded.
    @FXML private void initialize() {
        // Show the list of drinks and their prices
        labelName1.setText(""+_list.getDrink(0).getDrinkName());
        labelPrice1.setText(""+_list.getDrink(0).getDrinkPrice());
        labelName2.setText(""+_list.getDrink(1).getDrinkName());
        labelPrice2.setText(""+_list.getDrink(1).getDrinkPrice());
        labelName3.setText(""+_list.getDrink(2).getDrinkName());
        labelPrice3.setText(""+_list.getDrink(2).getDrinkPrice());

        // Image image1 = new Image(_list.getDrink(0).getImagePath());
        // img1.setImage(image1);

        // Image image2 = new Image(_list.getDrink(1).getImagePath());
        // img2.setImage(image2);
        
        // Image image3 = new Image(_list.getDrink(2).getImagePath());
        // img3.setImage(image3);

        //Set mouse click on list of drinks
        labelName1.setOnMouseClicked(e -> onLabel1Clicked());
        labelName2.setOnMouseClicked(e -> onLabel2Clicked());
        labelName3.setOnMouseClicked(e -> onLabel3Clicked());

        // Attach event handler(s)
        btnBack.setOnAction( e -> onBackClicked()); 
    }
    private void onBackClicked(){
        // Back to the Menu window (stage)
        try {
            Parent root = (AnchorPane)FXMLLoader.load(getClass().getResource("Menu.fxml"));
            Scene scene = new Scene(root);
            
            Stage secondStage = new Stage();
            secondStage.setScene(scene);
            secondStage.initModality(Modality.APPLICATION_MODAL);  // Use this so you have to close the 2nd window to return to main window
            secondStage.showAndWait();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    private void onLabel1Clicked(){
        // Open the DrinksDetails window (stage)
        try {
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
    private void onLabel2Clicked(){
         // Open the DrinksDetails window (stage)
        try {
            selectedDrink = _list.getDrink(1);
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
    private void onLabel3Clicked(){
         // Open the DrinksDetails window (stage)
        try {
            selectedDrink = _list.getDrink(2);
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
