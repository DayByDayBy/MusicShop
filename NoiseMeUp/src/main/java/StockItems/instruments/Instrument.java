package StockItems.instruments;
import StockItems.StockItem;
import behaviours.IPlay;

public abstract class Instrument extends StockItem implements IPlay {
    private final InstrumentType instrumentType;
    private final String sound;

    private boolean orchestral;

    public Instrument(double cost, double price, boolean orchestral, InstrumentType instrumentType, String sound) {
        super(cost, price);
        this.orchestral = orchestral;
        this.instrumentType = instrumentType;
        this.sound = sound;
    }

    public String sound() {
        return sound;
    }

    public boolean isOrchestral(){
        return orchestral;
    }
}

