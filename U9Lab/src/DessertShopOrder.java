package U9Lab.src;

import java.util.ArrayList;

public class DessertShopOrder {
    private ArrayList<DessertItem> itemList;

    public DessertShopOrder(ArrayList<DessertItem> itemList) {
        this.itemList = new ArrayList<DessertItem>();
    }

    /**
     * This method adds the item parameter provided to the itemList of an order
     * and prints a confirming statement.
     * @param itemName new item to be added
     */
    public void addItem(DessertItem itemName) {
        itemList.add(itemName);
        System.out.println("New item (" + itemName + ") been added to your order.");
    }

    public ArrayList<DessertItem> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<DessertItem> itemList) {
        this.itemList = itemList;
    }
}
