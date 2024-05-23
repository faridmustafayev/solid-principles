package s.good;

public class SaveToDb {
    private Invoice invoice;

    public SaveToDb(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDb() {
        System.out.println("save to database ..");
    }
}
