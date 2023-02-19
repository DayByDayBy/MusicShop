import StockItems.StockItem;
import StockItems.instruments.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestStockItem {

    Piano steinway;
    Marimba majestic;
    ElectricGuitar fender;

    Cello stradivarius;
    Shop noiseMeUp;
    ArrayList<StockItem> stock;
    double totalProfit;


    @Before

    public void setup () {
        stock = new ArrayList<>();
        majestic = new Marimba(8200, 9000, true, InstrumentType.MARIMBA, "bi-bing bing ba-bing");
        steinway = new Piano(3000, 4000, true, InstrumentType.PIANO, "plink, chank-chank plink plunk");
        fender = new ElectricGuitar(1200, 1900, false, InstrumentType.GUITAR, "dang-ga dank");
        stradivarius = new Cello(2000000,2100000, true, InstrumentType.CELLO, "zumm... zasingzaaaaaazum");
        noiseMeUp = new Shop("noise me up", 300000, stock, totalProfit);


    }

    @Test
    public void canAddToStock(){
        noiseMeUp.addToStock(steinway, stock);
        noiseMeUp.addToStock(fender, stock);
        noiseMeUp.addToStock(majestic, stock);
        noiseMeUp.addToStock(stradivarius, stock);
        assertEquals(4, stock.size());
        assertEquals(-1712400, noiseMeUp.getCash(),0.0);
    }

    @Test
    public void canMakeNoise(){
        assertEquals("plink, chank-chank plink plunk", steinway.sound());
    }

    @Test
    public void isItOrchestral(){
        assertTrue(stradivarius.isOrchestral());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(100000, stradivarius.calculateMarkup(), 0.0);
    }


}
