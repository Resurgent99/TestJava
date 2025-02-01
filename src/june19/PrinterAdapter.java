package june19;

public class PrinterAdapter implements OldPrinter {
    private NewPrinter newprinter;

    public PrinterAdapter(NewPrinter newprinter){
        this.newprinter = newprinter;
    }
    @Override
    public void print(String text) {
        newprinter.printMessage(text);

    }

}
