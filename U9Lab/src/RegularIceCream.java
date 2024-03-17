/*
Ruby Arun, Meera Srivathsa
Mrs. Denna, M359 AP CSA
U9 Inheritance Lab
March 2024
 */
package U9Lab.src;

public class RegularIceCream extends IceCream{
    private String topping1, topping2, topping3;
    private int numToppings;
    private boolean isCone;

    private final double REGULARICECREAMADDEDPRICE = 3.0;
    private final double TOPPPINGSCOST = 1.5;
    private final double CONECOST = 2.0;

    public RegularIceCream(String name, boolean isToGo, String flavor, int scoops, String topping1, String topping2,
                           String topping3, boolean isCone){
        super(name, isToGo, flavor, scoops);
        this.topping1 = topping1;
        this.topping1 = topping2;
        this.topping3 = topping3;
        this.numToppings = 0;
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
        if (numToppings == 0)  {
            str += ".";
        }
        else {
            str += ": " + topping1 + ", " + topping2 + ", " + topping3;
        }
        if (isCone) {
            str += "You have selected a cone.";
        }
        else {
            str += "You have selected a cup.";
        }
        return str;
    }

    /**
     * This method checks if the item ordered listed toppings.
     * @return true if String exists, but false if it's equal to 'null'
     */
    public int howManyToppings(){
        if (topping1 == null) {
            numToppings = 0;
            return 0;
        }
        else if (topping2 == null){
            numToppings = 1;
            return 1;
        }
        else if (topping3 == null) {
            numToppings = 2;
            return 2;
        }
        else {
            numToppings = 3;
            return 3;
        }
    }

    /**
     * This method sets the discount value for a milkshake between 20% and 35%.
     */
    public void makeDiscount(){
        setDiscVal((Math.random()*15+20)/100.0);
    }

    /**
     * This method calculates the price of an order of a regular ice cream based on the number of
     * scoops, number of each type of toppings, and whether it is a cone or not. It also generates and applies
     * the discount using the above helper methods, creating the final price.
     */
    public void calculatePrice() {
        super.setItemPrice(getItemPrice()+getScoops()*SCOOPCOST);
        super.setItemPrice(getItemPrice()+howManyToppings()*TOPPPINGSCOST);
        if (isCone) {
            setItemPrice(getItemPrice()+CONECOST);
        }
        makeDiscount();
        super.applyDiscount();
        System.out.println("The calculated price of this ordered item is " + getItemPrice() +".");
    }

    public String getTopping1() {
        return topping1;
    }

    public void setTopping1(String topping1) {
        this.topping1 = topping1;
    }

    public String getTopping2() {
        return topping2;
    }

    public void setTopping2(String topping2) {
        this.topping2 = topping2;
    }

    public String getTopping3() {
        return topping3;
    }

    public void setTopping3(String topping3) {
        this.topping3 = topping3;
    }

    public int getNumToppings() {
        return numToppings;
    }

    public void setNumToppings(int numToppings) {
        this.numToppings = numToppings;
    }

    public boolean isCone() {
        return isCone;
    }

    public void setCone(boolean cone) {
        isCone = cone;
    }

    public double getREGULARICECREAMADDEDPRICE() {
        return REGULARICECREAMADDEDPRICE;
    }

    public double getTOPPPINGSCOST() {
        return TOPPPINGSCOST;
    }

    public double getCONECOST() {
        return CONECOST;
    }
}
