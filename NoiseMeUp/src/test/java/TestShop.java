import StockItems.StockItem;
import StockItems.instruments.*;
import StockItems.peripherals.Plectrum;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestShop {

    ArrayList<StockItem> stock;
    double totalProfit;
    Piano steinway;
    Marimba majestic;
    ElectricGuitar fender;
    Cello stradivarius;
    Shop noiseMeUp;
    Plectrum jimDunlop;
    Plectrum ernieBall;




    @Before

    public void setup () {
        totalProfit = 0;
        stock = new ArrayList<>();
        majestic = new Marimba(8200, 9000, true, InstrumentType.MARIMBA, "bi-bing bing ba-bing");
        steinway = new Piano(3000, 4000, true, InstrumentType.PIANO, "plink, chank-chank plink plunk");
        fender = new ElectricGuitar(1200, 1900, false, InstrumentType.GUITAR, "dang-ga dank");
        stradivarius = new Cello(2000000,2100000, true, InstrumentType.CELLO, "zumm... zasingzaaaaaazum");
        jimDunlop = new Plectrum(0.20, 1.10);
        ernieBall = new Plectrum(0.30, 1.40);
        noiseMeUp = new Shop("noise me up", 300000, stock, totalProfit);


    }

    @Test
    public void canAddToStock(){
        noiseMeUp.addToStock(fender, stock);
        noiseMeUp.addToStock(majestic, stock);
        assertEquals(2, stock.size());
        assertEquals(290600, noiseMeUp.getCash(), 0.0);
    }


    @Test
    public void canCalculateMarkup(){
        assertEquals(100000, stradivarius.calculateMarkup(), 0.0);
    }


    @Test
    public void isItOrchestral(){
        assertTrue(stradivarius.isOrchestral());
    }


    @Test
    public void canSellItems(){
        noiseMeUp.addToStock(fender, stock);
        noiseMeUp.addToStock(steinway, stock);
        noiseMeUp.addToStock(jimDunlop, stock);
        noiseMeUp.addToStock(ernieBall, stock);
        noiseMeUp.sellToCustomer(fender);
        noiseMeUp.sellToCustomer(jimDunlop);
        noiseMeUp.sellToCustomer(ernieBall);
        assertEquals(297702, noiseMeUp.cash, 0.0);
        assertEquals(1, stock.size());
    }

    @Test
    public void canCalculateTotalStockMarkup(){
        noiseMeUp.addToStock(fender, stock);
        noiseMeUp.addToStock(steinway, stock);
        noiseMeUp.addToStock(jimDunlop, stock);
        noiseMeUp.addToStock(jimDunlop, stock);
        noiseMeUp.addToStock(jimDunlop, stock);
        noiseMeUp.addToStock(ernieBall, stock);
        noiseMeUp.addToStock(ernieBall, stock);
        noiseMeUp.addToStock(ernieBall, stock);
        noiseMeUp.addToStock(stradivarius, stock);
        noiseMeUp.addToStock(majestic, stock);
        assertEquals(102506, noiseMeUp.calculateTotalMarkup(stock), 0.0);


    }







}
