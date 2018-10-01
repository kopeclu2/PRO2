package makro;

public class Goods {
    private final String id, label, unit;
    private final Section section;
    private final double unitPrice;

    public Goods(String id, String label, String unit, Section section, double unitPrice) {
        this.id = id;
        this.label = label;
        this.unit = unit;
        this.section = section;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public String getUnit() {
        return unit;
    }

    public Section getSection() {
        return section;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double priceIncludingVAT() {
        return unitPrice * (1 + section.getVatRate());
    }
}
