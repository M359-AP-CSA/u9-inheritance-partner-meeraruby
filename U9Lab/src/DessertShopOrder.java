package U9Lab.src;

public class DessertShopOrder {
    private String name;
    private boolean isToGo;

    public DessertShopOrder(String name, boolean isToGo){
        this.name = name;
        this.isToGo = isToGo;
    }


    public String toString() {
        String str = "";
        str += "You have started an empty order with the name '" + name + "' that will be ";
        if (isToGo) {
            str += "to go. ";
        }
        else {
            str += "dine in. ";
        }
        return str;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsToGo() {
        return isToGo;
    }

    public void setToGo(boolean toGo) {
        isToGo = toGo;
    }
}
