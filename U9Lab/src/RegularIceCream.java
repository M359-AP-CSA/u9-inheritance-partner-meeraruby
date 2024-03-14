package U9Lab.src;

public class RegularIceCream extends IceCream{
    private boolean isCone;

    public RegularIceCream(String name, boolean isToGo, String flavor, String toppings, int scoops, boolean isCone){
        super(name, isToGo, flavor, toppings, scoops);
        this.isCone = isCone;

    }

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

    // @return: This method sets the discount value of a regular ice cream between 0.2 and 0.35
    public void makeDiscount(){
        setDiscVal((Math.random()*15+20)/100.0);
    }
}
