package StockItems.instruments;

public class Flute extends Instrument {
    public Flute(int cost, int price, boolean orchestral, InstrumentType instrumentType, String sound) {
        super(cost, price, true, instrumentType, sound);
    }
    @Override
    public String sound(String sound) {
        return sound;
    }
}
