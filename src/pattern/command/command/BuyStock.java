package pattern.command.command;

import pattern.command.receiver.Stock;

/**
 * Created by Naver on 2017. 8. 3..
 */
public class BuyStock implements Order {

    private final Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
