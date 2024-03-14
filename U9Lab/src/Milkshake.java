package U9Lab.src;

public class Milkshake extends DessertShopOrder {
    private String ingredients;
    private String size;
    private String milkType;

    public Milkshake(String name, boolean isToGo, double discVal, double itemPrice,  String ingredients, String size, String milkType){
        super(name, isToGo);
        this.ingredients = ingredients;
        this.size = size;
        this.milkType = milkType;
    }

    public String toString() {
        String str = "";
        str += "You have placed an order under the name + '" + getName() + "' for a " + size + " milkshake with "
                + milkType + " milk. You have chosen the following ingredients: " + ingredients + ". ";
        if(getIsToGo()) {
            str += " You have selected for a to-go ice cream. ";
        }
        else{
            str += " You have selected to dine-in. ";
        }
        return str;
    }


    // @return: This method sets the discount value for a milkshake between 0.0 and 0.1
    public void makeDiscount(){
        setDiscVal((Math.random()*10+0)/100.0);
    }
}
