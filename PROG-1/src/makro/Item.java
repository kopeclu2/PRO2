package makro;

public class Item {
    private final double amount;
    private final Discount discount;
    private final Goods goods;

    public Item(double amount, Discount discount, Goods goods) {
        this.amount = amount;
        this.discount = discount;
        this.goods = goods;
    }

    public double getAmount() {
        return amount;
    }

    public Discount getDiscount() {
        return discount;
    }

    public Goods getGoods() {
        return goods;
    }

    public double finalPrice() {
        return amount * goods.priceIncludingVAT() * (1 - discount.getValue());
    }
}
