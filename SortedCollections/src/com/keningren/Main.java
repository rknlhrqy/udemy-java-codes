package com.keningren;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.10, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 61.10, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.10, 200);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.20, 300);
        stockList.addStock(temp);


        temp = new StockItem("door", 81.10, 4);
        stockList.addStock(temp);

        System.out.println(stockList);

        Basket timsBasket = new Basket("Tim");
        sellItem(timsBasket, "car", 1);
        System.out.println(timsBasket);

        System.out.println(stockList);
    }

    public static int sellItem(Basket basket, String item, int quantity) {
        // restrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We do not sell " + item);
            return 0;
        }

        if (stockList.sellStock(item, quantity) != 0) {
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }
}
