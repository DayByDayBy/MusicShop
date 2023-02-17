import StockItems.StockItem;
import StockItems.instruments.InstrumentType;
import StockItems.instruments.Marimba;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class TestMarimba {

    Marimba majestic;
    Shop noiseMeUp;
    ArrayList<StockItem> stock;


    @Before

    public void setup () {
        stock = new ArrayList<>();
        majestic = new Marimba(8200, 9000, true, InstrumentType.MARIMBA, "bi-bing bing ba-bing");
        noiseMeUp = new Shop("noise me up", 300000, stock);


    }

    @Test
    public void canAddToStock(){
        noiseMeUp.addToStock(majestic, stock);
        assertEquals(1, stock.size());

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
