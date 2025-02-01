package june19;

interface OldPrinter {
    void print(String text);
}
public class OldPrinterImpl implements OldPrinter {
    @Override
    public void print(String text) {
        System.out.println("Старый принтер печатает: " + text);
    }
}
