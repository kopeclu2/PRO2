package knihovna;

public class Vypujcka {
    private final Ctenar ctenar;
    private final Kniha kniha;
    private final Datum vypujcenoDo;


    public Vypujcka(Ctenar ctenar, Kniha kniha, Datum vypujcenoDo) {
        this.ctenar = ctenar;
        this.kniha = kniha;
        this.vypujcenoDo = vypujcenoDo;
    }

    public Ctenar getCtenar() {
        return ctenar;
    }

    public Kniha getKniha() {
        return kniha;
    }

    public Datum getVypujcenoDo() {
        return vypujcenoDo;
    }

    public boolean isProsla(Datum datum){
        return vypujcenoDo.before(datum);
    }



}
