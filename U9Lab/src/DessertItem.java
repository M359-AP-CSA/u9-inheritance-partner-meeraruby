package U9Lab.src;

import java.util.ArrayList;

public class DessertItem {
    private String name;
    private boolean isToGo;
    private double discVal;
    private double itemPrice;

    public DessertItem(String name, boolean isToGo) {
        this.name = name;
        this.isToGo = isToGo;
        this.discVal = 0.0;
        this.itemPrice = 0.0;
    }

    /**
     * This method is called automatically when an object from this class is called to be printed.
     * @return String describing that order is empty with details
     */
    public String toString() {
        String str = "";
        str += "You have started an empty order with the name '" + name + "' that will be ";
        if (isToGo) {
            str += "to go. ";
        }
        else {
            str += "dine in. ";
        }
        str += "The price of this item is " + itemPrice + ".";
        return str;
    }

    /**
     * This method generates a random discount value from 0% to 100% and sets the generated value
     * as the discount of the order item.
     */
    public void makeDiscount(){
        discVal = (Math.random()*100)/100.0;
    }

    /**
     * This method applies the discount value to itemPrice.
     */
    public void applyDiscount() {
        itemPrice = (1-discVal)*itemPrice;
    }

    public void calculatePrice() {
        makeDiscount();
        applyDiscount();
        if (isToGo) {
            itemPrice += 1.0;
        }
        else {
            itemPrice += 3.0;
        }
        System.out.println("The calculated price of this ordered item is " + itemPrice +".");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsToGo() {
        return isToGo;
    }

    public void setToGo(boolean toGo) {
        isToGo = toGo;
    }

    public double getDiscVal() {
        return discVal;
    }

    public void setDiscVal(double discVal) {
        this.discVal = discVal;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
}
