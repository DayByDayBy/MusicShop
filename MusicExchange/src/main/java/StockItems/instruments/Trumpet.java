package StockItems.instruments;

public class Trumpet extends Instrument {
    public Trumpet(int cost, int price, boolean orchestral, InstrumentType instrumentType, String sound) {
        super(cost, price, true, instrumentType, sound);
    }
    @Override
    public String sound(String sound) {
        return sound;
    }
}
