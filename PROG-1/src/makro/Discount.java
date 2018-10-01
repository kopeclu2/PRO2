package makro;

public class Discount {
    private final String info;
    private final double value;

    public Discount(String info, double value) {
        this.info = info;
        this.value = value;
    }

    public String getInfo() {
        return info;
    }

    public double getValue() {
        return value;
    }
}
