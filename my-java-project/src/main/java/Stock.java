public class Stock {
    private String symbol;
    private String name;
    private double price;
    

    public Stock(String symbol, String name, double price) {
        this.symbol = symbol;
        this.price = price;
        this.name = name;
    }
    public String getSymbol() {
        return symbol;
    }
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Stock{" +
                "symbol='" + symbol + '\'' +
                ", price=" + price +
                ", name=" + name +
                '}';
    }
    
    // Additional methods for application logic can be added here
}