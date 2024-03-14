package U9Lab.src;

import java.util.ArrayList;

public class DessertItemTester {
    public static void main(String[] args) {
        DessertItem item1 = new DessertItem("ruby", true);
        System.out.println(item1);

        DessertItem chocoicecream = new IceCream("ruby", true, "chocolate", "sprinkles",
                "chocolate sauce", "marshmallows", 2);

        System.out.println(chocoicecream);

        ArrayList<DessertItem> rubyList = new ArrayList<DessertItem>();
        rubyList.add(chocoicecream);

        chocoicecream.makeDiscount();
        chocoicecream.applyDiscount();
        System.out.println(chocoicecream);
    }
}
