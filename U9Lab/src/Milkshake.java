package U9Lab.src;

public class Milkshake extends DessertItem {
    //figure out if ingredients need to be a list array (can be inputted by spaces into intenral array)
    private String extras;
    private String size;
    private String milkType;

    private final double MILKSHAKEPRICE = 7.0;
    private final double REGMILK = 2.00;

    private final double OATMILK = 2.89;
    private final double SOYMILK = 3.0;
    private final double SMALLADD = 0.5;
    private final double MEDIUMADD = 0.75;
    private final double LARGEADD = 1.0;

    public Milkshake(String name, boolean isToGo,  String extras, String size, String milkType){
        super(name, isToGo);
        this.extras = extras;
        this.size = size;
        this.milkType = milkType;
        super.setItemPrice(MILKSHAKEPRICE);
    }

    /**
     * This method is automatically called when an object of this class is called to be printed.
     * @return String description listing order details
     */
    public String toString() {
        String str = "";
        str += "You have placed an order under the name + '" + super.getName() + "' for a " + size + " milkshake with "
                + milkType + " milk. You have chosen the following ingredients: " + extras + ". ";
        if(super.getIsToGo()) {
            str += " You have selected for a to-go ice cream. ";
        }
        else{
            str += " You have selected to dine-in. ";
        }
        str += "The price of this item is " + getItemPrice() + ".";
        return str;
    }

    /**
     * This method sets the discount value for a milkshake between 0% and 1%.
     */
    public void makeDiscount(){
        setDiscVal((Math.random()*10+0)/100.0);
    }

    public double identifyMilkType(){
        if (milkType.equalsIgnoreCase("regular milk")){
            return REGMILK;
        }
        else if(milkType.equalsIgnoreCase("oat milk")){
            return OATMILK;
        }
        else if(milkType.equalsIgnoreCase("soy milk")) {
            return SOYMILK;
        }
        else {
            System.out.println("Unfortunately, we do not have the milk you requested. Please restart your order.");
            return -1*MILKSHAKEPRICE;
        }
    }

    public double identifySize(){
        if (size.equalsIgnoreCase("small")){
            return SMALLADD;
        }
        else if(milkType.equalsIgnoreCase("medium")){
            return MEDIUMADD;
        }
        else if(milkType.equalsIgnoreCase("large")) {
            return LARGEADD;
        }
        else {
            System.out.println("Unfortunately, we do not have the size you requested. We have cancelled your order, " +
                    "so you can please restart your order.");
            return -1*MILKSHAKEPRICE;
        }
    }

    public void calculatePrice() {
        super.setItemPrice(getItemPrice()+identifySize());
        super.setItemPrice(getItemPrice()+identifyMilkType());
        makeDiscount();
        super.applyDiscount();
    }
}
