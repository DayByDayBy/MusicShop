import StockItems.StockItem;
import StockItems.instruments.InstrumentType;
import StockItems.instruments.Marimba;
import StockItems.instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class TestPiano {

    Piano steinway;
    Shop noiseMeUp;
    ArrayList<StockItem> stock;


    @Before

    public void setup () {
        stock = new ArrayList<>();
        steinway = new Piano(3000, 4000, true, InstrumentType.PIANO, "plink, chank-chank plink plunk");
        noiseMeUp = new Shop("noise me up", 300000, stock);


    }

    @Test
    public void canAddToStock(){
        noiseMeUp.addToStock(steinway, stock);
        assertEquals(1, stock.size());
    }

    @Test
    public void canMakeNoise(){
        assertEquals("plink, chank-chank plink plunk", steinway.sound());
    }




}
