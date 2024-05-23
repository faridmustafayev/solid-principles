package s.bad;

public class Invoice {
    private Phone phone;
    private int amount;

    public Invoice(Phone phone, int amount) {
        this.phone = phone;
        this.amount = amount;
    }

    public int calculateTotal() {
        return this.amount * phone.getPrice();
    }

    public void printInvoice() {
        System.out.println("total price is : " + calculateTotal());
    }

    public void saveToDb() {
        System.out.println("save to database ..");
    }
}
