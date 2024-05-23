package s.good;

public class Invoice {
    private Phone phone;
    private int amount;

    public Invoice(Phone phone, int amount) {
        this.phone = phone;
        this.amount = amount;
    }

    public int calculateTotal() {
        return phone.getPrice() * this.amount;
    }
}
