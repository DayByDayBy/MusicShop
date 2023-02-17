import StockItems.StockItem;
import behaviours.ISell;
import java.util.ArrayList;

public class Shop implements ISell {
    String name;
    double cash;
    ArrayList<StockItem> stock;
    StockItem stockItem;

    public Shop(String name, double cash, ArrayList<StockItem> stock) {
        this.name = name;
        this.cash = cash;
        this.stock = stock;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public ArrayList<StockItem> getStock() {
        return stock;
    }

    public void setStock(ArrayList<StockItem> stock) {
        this.stock = stock;
    }

    public StockItem getStockItem() {
        return stockItem;
    }

    public void sellToCustomer(StockItem item){
        cash += item.getPrice();

    }

    public void addToStock(StockItem stockItem, ArrayList<StockItem> stock) {
        stock.add(stockItem);
        cash -= stockItem.getCost();
    }

    @Override
    public double calculateMarkup(double cost, double price) {
            return (stockItem.getPrice()/stockItem.getCost())*100;
        }


}
