package june19;

public class Test {
    public static void main(String[] args) {
        OldPrinter old = new OldPrinterImpl();
        OldPrinter adapter = new PrinterAdapter(new NewPrinterImpl());
        adapter.print(" Сосать");
        old.print("Сосать");
    }
}
