package makro;

public class Section {
    private final String name;
    private final double vatRate;

    public Section(double vatRate, String name) {
        this.vatRate = vatRate;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getVatRate() {
        return vatRate;
    }

}
