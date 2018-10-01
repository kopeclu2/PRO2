package makro;

public class Receipt {
    private final Item item1, item2;
    //DU: udelat Receipt jako Classroom (vcetne aktualizace Run)
    public Receipt(Item item1, Item item2) {
        this.item1 = item1;
        this.item2 = item2;
    }
    public double totalPrice() {
        return item1.finalPrice() + item2.finalPrice();
    }
}
