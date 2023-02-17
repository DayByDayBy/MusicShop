package StockItems.instruments;

public enum InstrumentType {


    CELLO("Strings", "zumm... zasingzaaaaaazum"),
    GUITAR( "Strings", "dang-ga dank"),
    PIANO ("Percussion", "plink, chank-chank plink plunk"),
    MARIMBA( "Percussion", "bi-bing bing ba-bing"),
    FLUTE("Woodwind", "tu-re-lu-re-lu");

    private final String category;
    private final String sound;

    InstrumentType(String category, String sound) {
        this.category = category;
        this.sound = sound;
    }


}








