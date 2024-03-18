/*
Ruby Arun, Meera Srivathsa
Mrs. Denna, M359 AP CSA
U9 Inheritance Lab
March 2024
 */
package U9Lab.src;

import java.util.ArrayList;

public class IceCream extends DessertItem {
    private String flavor;
    private int scoops;

    public final double ICECREAMBASEEPRICE = 4.0;
    public final double SCOOPCOST = 2.0;

    public IceCream(String name, boolean isToGo, String flavor, int scoops){
        super(name, isToGo);
        this.flavor = flavor;
        this.scoops = scoops;
        super.setItemPrice(ICECREAMBASEEPRICE);
    }

    /**
     * This method is automatically called when an object of this class is called to be printed.
     * @return String description listing order details
     */
    public String toString() {
        String str = "";
        str += "You have placed an order under the name '" + super.getName() + "' for ice cream with "
                + scoops + " scoops of " + flavor + ". ";
        if(super.getIsToGo()) {
            str += "You have selected for a to-go ice cream. ";
        }
        else{
            str += "You have selected to dine-in. ";
        }
        str += "The price of this item is " + getItemPrice() + ". ";
        return str;
    }

    /**
     * This method sets the discount value as a random number between 2% and 25%.
     */
    public void makeDiscount(){
        setDiscVal((Math.random()*20+5)/100.0);
    }

    /**
     * This method calculates the price of an order of an ice cream based on the number of
     * scoops. It also generates and applies the discount using the above helper methods,
     * creating the final price.
     */
    public void calculatePrice() {
        super.setItemPrice(getItemPrice()+scoops*SCOOPCOST);
        makeDiscount();
        super.applyDiscount();
        System.out.println("The calculated price of this ordered item is " + getItemPrice() +".");
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getScoops() {
        return scoops;
    }

    public void setScoops(int scoops) {
        this.scoops = scoops;
    }

    public double getICECREAMBASEEPRICE() {
        return ICECREAMBASEEPRICE;
    }

    public double getSCOOPCOST() {
        return SCOOPCOST;
    }
}
