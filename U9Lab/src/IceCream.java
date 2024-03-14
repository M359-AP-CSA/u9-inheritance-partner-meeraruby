package U9Lab.src;

public class IceCream extends DessertShopOrder {
    private String flavor;
    private String toppings;
    private int scoops;

    public IceCream(String name, boolean isToGo, String flavor, String toppings, int scoops){
        super(name, isToGo);
        this.flavor = flavor;
        this.toppings = toppings;
        this.scoops = scoops;
    }

    public String toString() {
        String str = "";
        str += "You have placed an order under the name + '" + getName() + "' for ice cream with "
                + scoops + " of " + flavor;
        if(hasToppings()) {
            str += " with toppings of " + toppings + ". ";
        }
        else {
            str += "with no toppings. ";
        }
        if(getIsToGo()) {
            str += "You have selected for a to-go ice cream. ";
        }
        else{
            str += "You have selected to dine-in. ";
        }
        return str;
    }

    //@return: This boolean returns whether the ice cream ordered has toppings or not

    public boolean hasToppings(){
        if (toppings != null) {
            return true;
        }
        else {
            return false;
        }
    }
    // @return: this method sets the discount value as a random number between 0.2 and 0.25
    public void makeDiscount(){
        setDiscVal((Math.random()*20+5)/100.0);
    }
}
