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

    public void makeDiscount(){
        discVal = (Math.random()*100+0)/100.0;
    }
    public void applyDiscount() {
        itemPrice = discVal*itemPrice;
    }

    public void addItem(DessertShopOrder itemName) {
        itemList.add(itemName);
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
