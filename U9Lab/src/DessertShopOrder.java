package U9Lab.src;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DessertShopOrder {
    private String name;
    private boolean isToGo;
    private double discVal;
    private double itemPrice;
    private ArrayList<DessertShopOrder> itemList;

    public DessertShopOrder(String name, boolean isToGo) {
        this.name = name;
        this.isToGo = isToGo;
        this.discVal = 0.0;
        this.itemPrice = 0.0;
        this.itemList = new ArrayList<DessertShopOrder>();
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

    // @param: This method takes in the dessert shop order of the customer and adds the itemname to the
    // list of things that they ordered

    /**
     * This method adds the item parameter provided to the itemList of an order
     * and prints a confirming statement.
     * @param itemName new item to be added
     */
    public void addItem(DessertShopOrder itemName) {
        itemList.add(itemName);
        System.out.println("New item has been added to your order.");
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

    public ArrayList<DessertShopOrder> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<DessertShopOrder> itemList) {
        this.itemList = itemList;
    }
}
