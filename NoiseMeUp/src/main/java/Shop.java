import StockItems.StockItem;
import behaviours.ISell;
import java.util.ArrayList;

public class Shop implements ISell {
    public double totalProfit;
    String name;
    double cash;
    ArrayList<StockItem> stock;
    StockItem stockItem;

    public Shop(String name, double cash, ArrayList<StockItem> stock, double totalProfit) {
        this.name = name;
        this.cash = cash;
        this.stock = stock;
        this.totalProfit = totalProfit;
    }


    public String getName() {
        return name;
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

    public void addToStock(StockItem stockItem, ArrayList<StockItem> stock) {
        stock.add(stockItem);
        setCash(cash -= stockItem.getCost());
    }

    public void sellToCustomer(StockItem stockItem){
        setCash(cash += stockItem.getPrice());
        stock.remove(stockItem);
    }

    public double calculateMarkup() {
            return (stockItem.getPrice()/stockItem.getCost())*100;
        }
    public double calculateTotalMarkup(ArrayList<StockItem> stock){
        for (ISell item : stock ) {
            totalProfit += item.calculateMarkup();


        }return totalProfit;





//        another way, using a stream:
//
//
//        return stock.stream()
//                .map(ISell::calculateMarkup)
//                .reduce(0, Integer::sum);


    }

}
