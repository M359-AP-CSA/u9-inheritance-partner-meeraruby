package U9Lab.src;

public class IceCream extends DessertShopOrder {
    private String flavor;
    private String toppings;
    private int scoops;

    public IceCream(String name, boolean isToGo, String flavor, String toppings, int scoops){
        super(name, isToGo);
        this.flavor = flavor;
        this.toppings = toppings;
        this.scoops = scoops;
    }

    /**
     * This method is automatically called when an object of this class is called to be printed.
     * @return String description listing order details
     */
    public String toString() {
        String str = "";
        str += "You have placed an order under the name + '" + super.getName() + "' for ice cream with "
                + scoops + " of " + flavor;
        if(hasToppings()) {
            str += " with toppings of " + toppings + ". ";
        }
        else {
            str += "with no toppings. ";
        }
        if(super.getIsToGo()) {
            str += "You have selected for a to-go ice cream. ";
        }
        else{
            str += "You have selected to dine-in. ";
        }
        return str;
    }

    /**
     * This method checks if the item ordered listed toppings.
     * @return true if String exists, but false if it's equal to 'null'
     */
    public boolean hasToppings(){
        if (toppings != null) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * This method sets the discount value as a random number between 2% and 25%.
     */
    public void makeDiscount(){
        setDiscVal((Math.random()*20+5)/100.0);
    }
}
