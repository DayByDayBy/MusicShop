package StockItems;

import behaviours.ISell;

public abstract class StockItem implements ISell {

    double cost;
    double price;

    public StockItem(double cost, double price) {
        this.cost = cost;
        this.price = price;
    }

    public double getCost() {
        return cost;
    }

    public double getPrice() {
        return price;
    }

    public double calculateMarkup(){
        return getPrice() - getCost();
    }
}

