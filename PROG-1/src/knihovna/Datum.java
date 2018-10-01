package knihovna;

public class Datum {
private final int den;
private final int mesic;
private final int rok;



    public Datum(int den, int mesic, int rok) {
        this.den = den;

        this.mesic = mesic;
        this.rok = rok;
    }

    public boolean before(Datum datum){
        if (this.rok < datum.getRok()) {
        }   else if (this.mesic < datum.getMesic()){}
                else if(this.den < datum.getDen()) return true;

        return false;

    }

    public int getDen() {
        return den;
    }

    public int getMesic() {
        return mesic;
    }

    public int getRok() {
        return rok;
    }

}
