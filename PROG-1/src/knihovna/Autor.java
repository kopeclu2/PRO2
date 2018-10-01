package knihovna;

public class Autor {
    private final String jmeno;
    private final String prijmeni;

    public Autor(String jmeno, String prijmeni) {

        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

}
