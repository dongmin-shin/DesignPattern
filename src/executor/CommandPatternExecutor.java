package executor;

import pattern.command.invoker.Broker;
import pattern.command.command.BuyStock;
import pattern.command.command.SellStock;
import pattern.command.receiver.Stock;

/**
 * Created by Naver on 2017. 8. 3..
 */
public class CommandPatternExecutor implements PatternExecutor  {

    @Override
    public void execute() {

        Broker broker = new Broker();

        // 네이버 주식 구매
        Stock naverStock = new Stock("NAVER", 10000);
        BuyStock buyNaverStock = new BuyStock(naverStock);
        broker.takeOrder(buyNaverStock);

        // 카카오 주식 판매
        Stock kakaoStock = new Stock("KAKAO", 500000);
        SellStock sellKakaoStock = new SellStock(kakaoStock);
        broker.takeOrder(sellKakaoStock);

        // 주문 수행
        broker.placeOrders();
    }
}