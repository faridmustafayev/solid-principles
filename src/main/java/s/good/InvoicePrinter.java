package s.good;

public class InvoicePrinter {
    private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoice() {
        System.out.println("total price is: " + invoice.calculateTotal());
    }
}
