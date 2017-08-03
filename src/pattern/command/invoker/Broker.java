package pattern.command.invoker;

import pattern.command.command.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Naver on 2017. 8. 3..
 */
public class Broker {

    private final List<Order> orderList = new ArrayList<>();

    // 주문을 받음
    public void takeOrder(Order order) {
        orderList.add(order);
    }

    // 주문 함
    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }

        orderList.clear();
    }

}
