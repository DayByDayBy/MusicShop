package StockItems.instruments;

public class Cello extends Instrument {
    public Cello(int cost, int price, boolean orchestral, InstrumentType instrumentType, String sound) {
        super(cost, price, true, instrumentType, sound);
    }
    @Override
    public String sound(String sound) {
        return sound;
    }
}
