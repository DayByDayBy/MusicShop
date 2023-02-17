package StockItems.instruments;

public class ElectricGuitar extends Instrument {
    public ElectricGuitar(int cost, int price, boolean orchestral, InstrumentType instrumentType, String sound) {
        super(cost, price, false, instrumentType, sound);
    }
    @Override
    public String sound(String sound) {
        return sound;
    }
}
