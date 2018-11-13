
import java.util.Date;

public class Product implements StoringItem {
    String name;
    int calories;
    Date expiration;

    public Product(String name, Date expiration) {
        this.name = name;
        this.expiration = expiration;
    }

    @Override
    public boolean checkExpiration() {
        return false;
    }

    @Override
    public long untilExpiration() {return (expiration.getTime()-System.currentTimeMillis())/(1000*3600*24);}
}
