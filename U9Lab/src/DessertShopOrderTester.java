package U9Lab.src;

public class DessertShopOrderTester {

    DessertShopOrder ruby = new DessertShopOrder("ruby", true);
    IceCream mintCone = new IceCream("ruby", true, "mint", "sprinkles", 2);
    ruby.addItem(mintCone);
}
