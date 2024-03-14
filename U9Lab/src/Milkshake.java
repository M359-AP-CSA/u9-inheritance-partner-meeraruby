package U9Lab.src;

public class Milkshake extends DessertItem {
    private String ingredients;
    private String size;
    private String milkType;

    private final double MILKSHAKEPRICE = 7.0;

    public Milkshake(String name, boolean isToGo,  String ingredients, String size, String milkType){
        super(name, isToGo);
        this.ingredients = ingredients;
        this.size = size;
        this.milkType = milkType;
        super.setItemPrice(MILKSHAKEPRICE);
    }

    /**
     * This method is automatically called when an object of this class is called to be printed.
     * @return String description listing order details
     */
    public String toString() {
        String str = "";
        str += "You have placed an order under the name + '" + super.getName() + "' for a " + size + " milkshake with "
                + milkType + " milk. You have chosen the following ingredients: " + ingredients + ". ";
        if(super.getIsToGo()) {
            str += " You have selected for a to-go ice cream. ";
        }
        else{
            str += " You have selected to dine-in. ";
        }
        return str;
    }

    /**
     * This method sets the discount value for a milkshake between 0% and 1%.
     */
    public void makeDiscount(){
        setDiscVal((Math.random()*10+0)/100.0);
    }
}
