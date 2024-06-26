/*
Ruby Arun, Meera Srivathsa
Mrs. Denna, M359 AP CSA
U9 Inheritance Lab
March 2024
 */
package U9Lab.src;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class DessertShopOrder {
    private ArrayList<DessertItem> itemList;
    private double totalPrice;

    public DessertShopOrder() {
        this.itemList = new ArrayList<DessertItem>();
        this.totalPrice = 0.0;
    }

    /**
     * This method adds the item parameter provided to the itemList of an order
     * and prints a confirming statement.
     * @param itemName new item to be added
     */
    public void addItem(DessertItem itemName) {
        itemList.add(itemName);
        System.out.println("New item (" + itemName.getClass().getName().substring(10) + ") been added to your order.");
    }

    /**
     * This method calculates the total price of the items in the itemList.
     */
    public void calculateTotalPrice(){
        for (int i =0; i < itemList.size(); i++) {
            totalPrice += itemList.get(i).getItemPrice();
        }
        System.out.println("The calculated price of this ordered item is " + totalPrice +". ");
    }

    /**
     * This method iterates through every item in the ArrayList itemlist and prints each one by calling the toString.
     * @return
     */
    public String toString(){
        String str = "";
        for (int i = 0; i < itemList.size(); i++) {
            str += itemList.get(i) + ", ";
        }
        return str;
    }

    public ArrayList<DessertItem> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<DessertItem> itemList) {
        this.itemList = itemList;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
