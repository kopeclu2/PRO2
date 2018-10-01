package makro;

import java.util.Random;
import java.util.Scanner;



public class Run {
    private static Random random = new Random();
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //DU: naprogramovat ReceiptArray a ReceiptLinked (vcetne totalPrice)
        final Section
                groceries = new Section(0.15, "groceries"),
                toiletries = new Section(0.21, "toiletries");
        final Discount
                noDiscount = new Discount("none", 0),
                summerSale = new Discount("summer sale", 0.1);
        final Goods
            bun = new Goods(
                    "bun", "white bread bun", "pc",
                    groceries, 2.9),
            soap = new Goods(
                    "soap", "liquid soap", "l",
                    toiletries, 59.9);
        final Receipt receipt = new Receipt(
                new Item(5, noDiscount, bun),
                new Item(1.5, summerSale, soap)
        );
        System.out.println(receipt.totalPrice());
    }
}
