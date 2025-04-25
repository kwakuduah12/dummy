import java.io.*;
import java.util.*;


public class StockMarket {
    private List<Stock> stocks; //[Philips, Apple, Microsoft]
    // private HashMap<String, Stock> stockMap; // {AAPL=Apple, MSFT=Microsoft}
    public StockMarket() {
        this.stocks = new ArrayList<>(); // ["AAPL,Apple,150.0", ]
    }

    public Stock getStock(String symbol) {
        for (Stock stock : stocks) {
            if (stock.getSymbol().equalsIgnoreCase(symbol)) {
                return stock;
            }
        }
        return null;
    }

    public void updateStockPrice(String symbol, double newPrice) {
        Stock stock = getStock(symbol);
        if (stock != null) {
            stock.setPrice(newPrice);
        }
    }

    public void displayStocks() {
        for (Stock stock : stocks) {
            System.out.println(stock);
        }
    }
    public void addStock(Stock newStock) {
        stocks.add(newStock);
    }
    public void removeStock(String symbol) {
        Stock stock = getStock(symbol);
        if (stock != null) {
            stocks.remove(stock);
        }
    }
    public void lookupStock(String symbol) {
        Stock stock = getStock(symbol);
        if (stock != null) {
            System.out.println(stock);
        } else {
            System.out.println("Stock not found.");
        }
    }
}
