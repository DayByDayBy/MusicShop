package StockItems.instruments;

public class Marimba extends Instrument {

    String sound;

    public Marimba(int cost, int price, boolean orchestral, InstrumentType instrumentType, String sound) {
        super(cost, price, true, instrumentType, sound);
    }


    @Override
    public String sound(String sound) {
        return sound;
    }
}
