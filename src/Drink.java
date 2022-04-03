/**
 * This class represents one item in the list.
 */
public class Drink{
    //Field variables
    private int _drinkID;
    private String _drinkName;
    private double _drinkPrice;
    /*
    private String _imagePath;

    public String getImagePath() {
        return _imagePath;
    }
    public void setImagePath(String imagePath) {
        _imagePath = imagePath;
    }

*/
    //getter and setter
    public int getDrinkID() {
        return _drinkID;
    }
    public void setDrinkID(int drinkID) {
        _drinkID = drinkID;
    }
    public String getDrinkName() {
        return _drinkName;
    }
    public void setDrinkName(String drinkName) {
        _drinkName = drinkName;
    }
    public double getDrinkPrice() {
        return _drinkPrice;
    }
    public void setDrinkPrice(double drinkPrice) {
        _drinkPrice = drinkPrice;
    }

    //3-args constructor
    public Drink(int drinkID, String drinkName, double drinkPrice){
        _drinkID = drinkID;
        _drinkName = drinkName;
        _drinkPrice = drinkPrice;
       // _imagePath = imagePath;
    }
    
    public String toString() {
        return _drinkName;
    }
}