import java.io.IOException;
import java.sql.*;
import java.util.Date;

public class Main {
    private static Connection connection;
    private static Statement statement;
    private static PreparedStatement ps;

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        StoragePlace kitchen=new Kitchen("холодильник");
        StoringItem si=kitchen.createItem("кабачок",new Date(118,10,15));
        System.out.println(si.untilExpiration());
        Operation op=kitchen.createOperation();
        op.add(new StoringItem[]{si,si}, new int[]{100,200});
        System.out.println(op);
        Instrument ins=kitchen.createInstrument();
        ins.use();
        try {
            Aftershopper.scanBill("1.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        connect();


    }
    public static void connect() throws SQLException, ClassNotFoundException{
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:proddb.db");
        statement = connection.createStatement();
    }
    public static void disconnect() {
        try{
            statement.close();
            connection.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
