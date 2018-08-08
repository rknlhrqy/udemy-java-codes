package com.keningren;

import java.util.*;

public class StockList {
    private final Map<String, StockItem> list;

    public StockList() {
        //this.list = new HashMap<>();
        //this.list = new LinkedHashMap<>();
        this.list = new TreeMap<>();
    }

    public int addStock(StockItem item) {
        if (item != null) {
            // check if already have quantities of this item
            StockItem inStock = list.getOrDefault(item.getName(), item);
            // If there are already stocks on this item, adjust the quantity
            if (inStock != item)  {
                item.adjustStock(inStock.quantityInStock());
            }

            list.put(item.getName(), item);
            return item.quantityInStock();
        }
        return 0;
    }

    public int sellStock(String  item, int quantity) {
        StockItem inStock = list.getOrDefault(item, null);

        if ((item != null) && (inStock.quantityInStock() >= quantity) && (quantity >= 0)) {
            inStock.adjustStock(-quantity);
            return quantity;
        }
        return 0;
    }

    public StockItem get(String stockName) {
        return list.get(stockName);
    }

    public Map<String, StockItem> getList() {
        return Collections.unmodifiableMap(list);
    }


    @Override
    public String toString() {
        String s = "\nStock List\n";

        double totalCost = 0.0;

        for(Map.Entry<String, StockItem> item: list.entrySet()){
            StockItem stockItem = item.getValue();

            double itemValue = stockItem.getPrice() * stockItem.quantityInStock();
            s += stockItem + ". There are " + stockItem.quantityInStock() + " in stock. Value of items: ";
            s += String.format("%.2f", itemValue) + "\n";

            totalCost += itemValue;
        }

        return s + "Total stock value: " + totalCost;
    }
}
