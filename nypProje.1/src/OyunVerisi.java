import java.util.* ;
import java.util.Random;

public class OyunVerisi {


    private ArrayList<Dusman> aktifDusmanlar;

    public OyunVerisi() {

    }
    //17-21 arasında OyunVerisi UML inde belirtilen ArrayListler  oluşturuldu
    private ArrayList<Sovalye> sovalyeler = new ArrayList<>();
    private ArrayList<Sovalye> aktifSovalyeler = new ArrayList<>();
    private ArrayList<Dusman> dusmanlar = new ArrayList<>();
    private ArrayList<Dusman> aktifDusman = new ArrayList<>();
    private ArrayList<Sans> sanslar = new ArrayList<>();




    //34-47 arasında sovalyeler oluşturuldu ve sovalyelerin yarısı güçlü (id=1) , kalan yarısı zayıf tanımlandı (id=2)
    public ArrayList<Sovalye> getSovalyeler() {
        Sovalye sovalye1 = new GucluSovalye("Harry", 1);
        Sovalye sovalye2 = new GucluSovalye("Hermonie", 1);
        Sovalye sovalye3 = new GucluSovalye("Ron", 1);
        Sovalye sovalye4 = new GucluSovalye("Fred", 1);
        Sovalye sovalye5 = new GucluSovalye("George", 1);
        Sovalye sovalye6 = new ZayifSovalye("Luna", 2);
        Sovalye sovalye7 = new ZayifSovalye("Neville", 2);
        Sovalye sovalye8 = new ZayifSovalye("Lupin", 2);
        Sovalye sovalye9 = new ZayifSovalye("Molly", 2);
        Sovalye sovalye10 = new ZayifSovalye("Arhtur", 2);

        return sovalyeler;
    }
    public ArrayList<Sovalye> getAktifSovalyeler(){

        return aktifSovalyeler;
    }

    public ArrayList<Dusman> getDusmanlar(){

        return dusmanlar;
    }

    public ArrayList<Sans> getSanslarr(){

        return sanslar;
    }

    public ArrayList<String> getSovalye(){

        return null;
    }

}

