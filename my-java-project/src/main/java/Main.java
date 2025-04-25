import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        // Path to the CSV file
        String csvFile = "stocks.csv";
        String line;
        String csvSplitBy = ","; // Comma as separator

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                // Split the line into parts
                String[] stockData = line.split(csvSplitBy); // e.g., "AAPL,Apple,150.0"

                // Assuming the CSV format is: symbol,name,price
                String symbol = stockData[0];
                String name = stockData[1];
                double price = Double.parseDouble(stockData[2]);

                // Create a new Stock object and add it to the StockMarket
                Stock stock = new Stock(symbol, name, price);
                stockMarket.addStock(stock);
            }
        } catch (IOException e) {
            System.err.println("Error reading the CSV file: " + e.getMessage());
        }

        // Display the stocks in the StockMarket
        System.out.println("Stock Market from CSV:");
        stockMarket.displayStocks();
    }
}
