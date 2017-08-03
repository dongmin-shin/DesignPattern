package pattern.command.receiver;

/**
 * Created by Naver on 2017. 8. 3..
 */
public class Stock {

    private final String name;
    private final int quantity;

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void buy() {
        System.out.println("Stock [Name: " + name + ", Quantity: " + quantity + "] bought");
    }

    public void sell() {
        System.out.println("Stock [Name: " + name + ", Quantity: " + quantity + "] sold");
    }


}
