package U9Lab.src;

public class Sundae extends IceCream{
    private String sauce;
    private boolean hasBananas;
    private boolean hasCherries;

    private final double SUNDAEADDEDPRICE = 3.0;
    public Sundae(String name, boolean isToGo, String flavor, String toppings, int scoops, String sauce,
                  boolean hasBananas, boolean hasCherries){
        super(name, isToGo, flavor, toppings, scoops);
        this.sauce = sauce;
        this.hasBananas = hasBananas;
        this.hasCherries = hasCherries;
        super.setItemPrice(super.getItemPrice()+SUNDAEADDEDPRICE);
    }

    /**
     * This method is automatically called when an object of this class is called to be printed.
     * @return String description listing order details with cone/cup specifications
     */
    public String toString() {
        String str = "";
        str += super.toString();
        if (super.getIsToGo()) {
            str += "You have selected a cone.";
        }
        else {
            str += "You have selected a cup.";
        }
        return str;
    }

    /**
     * This method sets the discount value for an ice cream item between 5% and 55%.
     */    public void makeDiscount(){
        setDiscVal((Math.random()*50+5)/100.0);
    }
}
