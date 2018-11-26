import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class Aftershopper {
    //это паттерн фасад, который добавляет продукты на кухню после шоппинга
    public static StoringItem[] scanBill(String pathname) throws IOException {
        StoringItem[] result=new StoringItem[10];
        File file=new File(pathname);
        FileReader fr=new FileReader(file);
        char a[]=new char[300];
        fr.read(a);
        String b=String.valueOf(a).replace('\n',' ');
        String[] bill=b.split(" ");
        System.out.println(bill[1]);
        for (int i=0;i<bill.length;i=+2){
            String[] date=bill[i+1].split(".");
            System.out.println(date[0]);
            int year=Integer.valueOf(date[2]);
            int month=Integer.valueOf(date[1]);
            int day=Integer.valueOf(date[0]);
            result[0]=new Product(bill[i], new Date(year-1900,month,day));
        }
        System.out.println(bill[0]);
        return result;
    }
}
