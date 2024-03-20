/*
Ruby Arun, Meera Srivathsa
Mrs. Denna, M359 AP CSA
U9 Inheritance Lab
March 2024
 */
package U9Lab.src;

public class DessertShopTester {
    public static void main(String[] args) {
        DessertItem generalItem = new DessertItem("ruby", true);
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


        System.out.println(generalItem);
        System.out.println(chocoicecream);
        System.out.println(yummysundae);
        System.out.println(vanillashake);
        System.out.println(rubysgrouporder);
    }
}
