import java.util.*;

public class Main {
        public static void main(String[] args) {
    //gerekli metodları çağırmak için nesneler oluşturdum. (6-7)
    OyunGorunumu oyunGorunumu = new OyunGorunumu();
    OyunVerisi oyunVerisi = new OyunVerisi();

    oyunGorunumu.baslangicEkrani();
    oyunGorunumu.anaMenuyuGoster();
    oyunGorunumu.menudenSecimYap();
   // oyunGorunumu.SovalyeyiDegistir();
        }
    }
