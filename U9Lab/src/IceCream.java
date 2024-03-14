package U9Lab.src;

import java.util.ArrayList;

public class IceCream extends DessertItem {
    private String flavor;
    private String topping1, topping2, topping3;
    private int scoops;
    private int numToppings;

    private final double ICECREAMBASEEPRICE = 4.0;

    public IceCream(String name, boolean isToGo, String flavor, String topping1, String topping2, String topping3, int scoops){
        super(name, isToGo);
        this.flavor = flavor;
        this.topping1 = topping1;
        this.topping2 = topping2;
        this.topping3 = topping3;
        this.scoops = scoops;
        this.numToppings = 0;
        super.setItemPrice(ICECREAMBASEEPRICE);
    }

    /**
     * This method is automatically called when an object of this class is called to be printed.
     * @return String description listing order details
     */
    public String toString() {
        String str = "";
        str += "You have placed an order under the name '" + super.getName() + "' for ice cream with "
                + scoops + " scoops of " + flavor + " with " + numToppings + " topping(s)";
        if (numToppings == 0)  {
            str += ".";
        }
        else {
            str += ": " + topping1 + ", " + topping2 + ", " + topping3;
        }
        if(super.getIsToGo()) {
            str += "You have selected for a to-go ice cream. ";
        }
        else{
            str += "You have selected to dine-in. ";
        }
        str += "The price of this item is " + getItemPrice() + ".";
        return str;
    }

    /**
     * This method checks if the item ordered listed toppings.
     * @return true if String exists, but false if it's equal to 'null'
     */
    public int howManyToppings(){
        if (topping1 == null) {
            setNumToppings(0);
            return 0;
        }
        else if (topping2 == null){
            setNumToppings(1);
            return 1;
        }
        else if (topping3 == null) {
            setNumToppings(2);
            return 2;
        }
        else {
            setNumToppings(3);
            return 3;
        }
    }

    /**
     * This method sets the discount value as a random number between 2% and 25%.
     */
    public void makeDiscount(){
        setDiscVal((Math.random()*20+5)/100.0);
    }

    public void calculatePrice() {
        /*make a method to calculate price based on num scoops, and use constants defined above (need to be defined)
        for the different toppings, if it's not recognized, charge none and say we don't have that topping

        for numScoops, 
        */
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getTopping1() {
        return topping1;
    }

    public void setTopping1(String topping1) {
        this.topping1 = topping1;
    }

    public String getTopping2() {
        return topping2;
    }

    public void setTopping2(String topping2) {
        this.topping2 = topping2;
    }

    public String getTopping3() {
        return topping3;
    }

    public void setTopping3(String topping3) {
        this.topping3 = topping3;
    }

    public int getScoops() {
        return scoops;
    }

    public void setScoops(int scoops) {
        this.scoops = scoops;
    }

    public int getNumToppings() {
        return numToppings;
    }

    public void setNumToppings(int numToppings) {
        this.numToppings = numToppings;
    }

    public double getICECREAMBASEEPRICE() {
        return ICECREAMBASEEPRICE;
    }
}
