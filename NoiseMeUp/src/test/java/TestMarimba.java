import StockItems.StockItem;
import StockItems.instruments.InstrumentType;
import StockItems.instruments.Marimba;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class TestMarimba {

    Marimba majestic;
    ArrayList<StockItem> stock;


    @Before

    public void setup () {
        stock = new ArrayList<>();
        majestic = new Marimba(8200, 9000, true, InstrumentType.MARIMBA, "bi-bing bing ba-bing");
    }

    @Test
    public void canMakeNoise(){
        assertEquals("bi-bing bing ba-bing", majestic.sound());
    }

    @Test
    public void canCheckOrchestral(){
        assertEquals(true, majestic.isOrchestral());
    }




}
