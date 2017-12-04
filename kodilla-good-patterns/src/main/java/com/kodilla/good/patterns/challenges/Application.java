package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String args[]) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrive();

        OrderProcessor orderProcessor = new OrderProcessor(new ProductOrderService(), new ProductInformationService(), new ProductOrderRepository());
        orderProcessor.process(orderRequest);
    }
}
