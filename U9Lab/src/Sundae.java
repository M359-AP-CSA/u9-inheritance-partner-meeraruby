package U9Lab.src;

public class Sundae extends IceCream{
    private String sauce;
    private boolean hasBananas;
    private boolean hasCherries;
    public Sundae(String name, boolean isToGo, String flavor, String toppings, int scoops, String sauce,
                  boolean hasBananas, boolean hasCherries){
        super(name, isToGo, flavor, toppings, scoops);
        this.sauce = sauce;
        this.hasBananas = hasBananas;
        this.hasCherries = hasCherries;

    }

    public String toString() {
        String str = "";
        str += super.toString();
        if (getIsToGo()) {
            str += "You have selected a cone.";
        }
        else {
            str += "You have selected a cup.";
        }
        return str;
    }
}
