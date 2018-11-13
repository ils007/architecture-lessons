import java.io.IOException;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        StoragePlace kitchen=new Kitchen("холодильник");
        StoringItem si=kitchen.createItem("кабачок",new Date(118,10,15));
        System.out.println(si.untilExpiration());
        Operation op=kitchen.createOperation();
        System.out.println(op);
        Instrument ins=kitchen.createInstrument();
        ins.use();
        try {
            Aftershopper.scanBill("1.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
