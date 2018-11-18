
import java.util.Date;

public class Kitchen implements StoragePlace {
    String name;

    public Kitchen(String name){
        this.name=name;
    }
    @Override
    public StoringItem createItem(String name, Date expiration) {
        return new Product(name, expiration);
    }

    @Override
    public Operation createOperation() {
        return new Recipe();
    }

    @Override
    public Instrument createInstrument() {return new CookInstrument();
    }
}
