/*
Ruby Arun, Meera Srivathsa
Mrs. Denna, M359 AP CSA
U9 Inheritance Lab
March 2024
 */
package U9Lab.src;

public class Sundae extends IceCream{
    private String sauce;
    private boolean hasBananas;
    private boolean hasCherries;

    private final double SUNDAEADDEDPRICE = 3.0;
    private final double SAUCECOST = 1.39;
    private final double BANANASCOST = 2.50;
    private final double CHERRIESCOST = 1.99;
    public Sundae(String name, boolean isToGo, String flavor, int scoops, String sauce,
                  boolean hasBananas, boolean hasCherries){
        super(name, isToGo, flavor, scoops);
        this.sauce = sauce;
        this.hasBananas = hasBananas;
        this.hasCherries = hasCherries;
        super.setItemPrice(super.getItemPrice()+SUNDAEADDEDPRICE);
    }

    /**
     * This method is automatically called when an object of this class is called to be printed.
     * @return String description listing order details with cone/cup specifications
     */
    public String toString() {
        String str = "";
        str += super.toString();
        if (super.getIsToGo()) {
            str += "You have selected a cone. ";
        }
        else {
            str += "You have selected a cup. ";
        }
        return str;
    }

    /**
     * This method sets the discount value for an ice cream item between 5% and 55%.
     */    public void makeDiscount(){
        setDiscVal((Math.random()*50+5)/100.0);
    }

    /**
     * This method calculates the price of an order of a sundae based on the number of
     * scoops, if it has sauce, if it has bananas, and if it has cherries. It also generates and applies
     * the discount using the above helper methods, creating the final price.
     */
    public void calculatePrice() {
        super.setItemPrice(getItemPrice()+getScoops()*SCOOPCOST);
        if (sauce != null) {
            setItemPrice(getItemPrice()+SAUCECOST);
        }
        if (hasBananas) {
            setItemPrice(getItemPrice()+BANANASCOST);
        }
        if (hasCherries) {
            setItemPrice(getItemPrice()+CHERRIESCOST);
        }
        makeDiscount();
        super.applyDiscount();
        System.out.println("The calculated price of this ordered item is " + getItemPrice() +".");
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public boolean isHasBananas() {
        return hasBananas;
    }

    public void setHasBananas(boolean hasBananas) {
        this.hasBananas = hasBananas;
    }

    public boolean isHasCherries() {
        return hasCherries;
    }

    public void setHasCherries(boolean hasCherries) {
        this.hasCherries = hasCherries;
    }

    public double getSUNDAEADDEDPRICE() {
        return SUNDAEADDEDPRICE;
    }

    public double getSAUCECOST() {
        return SAUCECOST;
    }

    public double getBANANASCOST() {
        return BANANASCOST;
    }

    public double getCHERRIESCOST() {
        return CHERRIESCOST;
    }
}
