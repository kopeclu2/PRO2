package knihovna;

public class Knihovna {
    private final Vypujcka vypujcka1;
    private final Vypujcka vypujcka2;

    public Knihovna(Vypujcka vypujcka1, Vypujcka vypujcka2) {
        this.vypujcka1 = vypujcka1;
        this.vypujcka2 = vypujcka2;
    }

    public Vypujcka getVypujcka1() {
        return vypujcka1;
    }

    public Vypujcka getVypujcka2() {
        return vypujcka2;
    }


    public boolean isVypujcka(Ctenar ctenar, Vypujcka v){

        if (v.getCtenar().getJmeno().equals(ctenar.getJmeno()) && v.getCtenar().getPrijmeni().equals(ctenar.getPrijmeni())){
            return true;
        }


        return false;


    }

    public boolean isPoExpiraci(Ctenar ctenar, Datum d){


        return false;
    }
}
