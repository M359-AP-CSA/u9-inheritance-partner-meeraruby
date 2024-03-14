package U9Lab.src;

public class RegularIceCream extends IceCream{
    private boolean isCone;

    private final double REGULARICECREAMADDEDPRICE = 3.0;

    public RegularIceCream(String name, boolean isToGo, String flavor, String toppings,
                           int scoops, boolean isCone){
        super(name, isToGo, flavor, toppings, scoops);
        this.isCone = isCone;
        super.setItemPrice(super.getItemPrice()+REGULARICECREAMADDEDPRICE);

    }

    /**
     * This method is automatically called when an object of this class is called to be printed.
     * @return String description listing order details w/ cone/cup specifications
     */
    public String toString() {
        String str = "";
        str += super.toString();
        if (isCone) {
            str += "You have selected a cone.";
        }
        else {
            str += "You have selected a cup.";
        }
        return str;
    }

    /**
     * This method sets the discount value for a milkshake between 20% and 35%.
     */
    public void makeDiscount(){
        setDiscVal((Math.random()*15+20)/100.0);
    }
}
