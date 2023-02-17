package StockItems.instruments;

public class Piano extends Instrument {
    public Piano(int cost, int price, boolean orchestral, InstrumentType instrumentType, String sound) {
        super(cost, price, true, instrumentType, sound);
    }

    @Override
    public String sound(String sound) {
        return sound;
    }

}
