public class CookInstrument implements Instrument{
    String purpose;

    @Override
    public void use() {
        System.out.println("instrument does some action");
    }
}
