public class CashRegister {

    private Printer printer;

    public CashRegister(Printer printer) {
        this.printer = printer;
    }

    void process(Purchase purchase) {
        printer.print(purchase.getDescription());
    }
}
