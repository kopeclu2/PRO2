package knihovna;

import java.util.Random;
import java.util.Scanner;

public class Run {
    private static Random random = new Random();
    private static Scanner input = new Scanner(System.in);

    public static void main( String[] args){

        Ctenar franta = new Ctenar("Franta","Novak");
        Ctenar pepa = new Ctenar("epap","Novotny");

        Autor capek = new Autor("Kraqle","Capek");
        Kniha tovarna = new Kniha("Tovarna", capek, "5465165983");
        Kniha rur = new Kniha("Rur", capek,"65496565");

        Vypujcka v1 = new Vypujcka(pepa,rur, new Datum(27,5,1997));
        Vypujcka v2 = new Vypujcka(franta,tovarna,new Datum(28,6,2005));

        Knihovna k = new Knihovna(v1,v2);

        System.out.println(k.isVypujcka(pepa,v1));




    }
}
