public class CashRegister {

    private Printer printer;

    public CashRegister(Printer printer) {
        this.printer = printer;
    }

    void process(Purchase purchase) {
        final int discount = calculateDiscount(purchase);
        printer.print(purchase.getDescription() + "\nDiscount is:" + discount);
    }

    int calculateDiscount(Purchase purchase) {
        throw new UnsupportedOperationException("Not implemented!");
    }
}
