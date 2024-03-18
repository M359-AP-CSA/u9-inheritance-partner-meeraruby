/*
Ruby Arun, Meera Srivathsa
Mrs. Denna, M359 AP CSA
U9 Inheritance Lab
March 2024
 */
package U9Lab.src;

import java.util.ArrayList;

public class DessertItemTester {
    public static void main(String[] args) {
        DessertItem item1 = new DessertItem("ruby", true);
        System.out.println(item1);

        IceCream chocoicecream = new IceCream("ruby", true, "chocolate", 2);
        chocoicecream.calculatePrice();
        Sundae yummysundae = new Sundae("meera", true,"strawberry",2,"chocolate",true,false);
        yummysundae.calculatePrice();
        Milkshake vanillashake = new Milkshake("mrs. denna",false,"choco chips","medium","regular");
        vanillashake.calculatePrice();
        DessertShopOrder rubysgrouporder = new DessertShopOrder();
        rubysgrouporder.addItem(chocoicecream);
        rubysgrouporder.addItem(yummysundae);
        rubysgrouporder.addItem(vanillashake);
        rubysgrouporder.calculateTotalPrice();
    }
}
