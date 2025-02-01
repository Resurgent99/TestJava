package june19;

interface NewPrinter {
    void printMessage(String message);
}
public class NewPrinterImpl implements NewPrinter {
   @Override
    public void printMessage(String message) {
        System.out.println("Printing: " + message);
    }
}
