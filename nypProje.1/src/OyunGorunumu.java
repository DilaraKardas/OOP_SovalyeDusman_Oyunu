import java.util.*;
public class OyunGorunumu {

    private OyunVerisi oyunVerisi;
    private SavasMotoru savasMotoru;

    public OyunGorunumu() {

    }

    public void baslangicEkrani() {

    }
//15-25 arasında  menüyü oluşturdum
    public void anaMenuyuGoster() {
        System.out.println("ANA MENÜ");
        System.out.println("1. Tüm şövalyeleri göster");
        System.out.println("2. Aktif olan Şövalyeleri göster");
        System.out.println("3. Adı girilen Şövalye bilgilerini göster");
        System.out.println("4. Adı girilen şövalyeyi değiştir");
        System.out.println("5. Yardım");
        System.out.println("6. Oyunu başlat");
        System.out.println("7. Oyundan çık");
        System.out.println("Lütfen seçiminizi yapınız:");
    }

    public void yardim() {
    }
    public static void sovalyeleriGoster() {

        ArrayList<String> sovalyeler = new ArrayList<String>();

        sovalyeler.add("Harry");
        sovalyeler.add("Hermonie");
        sovalyeler.add("Ron");
        sovalyeler.add("Fred");
        sovalyeler.add("George");
        sovalyeler.add("Neville");
        sovalyeler.add("Luna");
        sovalyeler.add("Lupin");
        sovalyeler.add("Molly");
        sovalyeler.add("Arthur");

        for(String a : sovalyeler){

            System.out.println(a);
        }
    }


    public static void aktifSovalyeleriGoster() {

        ArrayList<String> sovalyeler = new ArrayList<String>();

        sovalyeler.add("Harry");
        sovalyeler.add("Hermonie");
        sovalyeler.add("Ron");
        sovalyeler.add("Fred");
        sovalyeler.add("George");
        sovalyeler.add("Neville");
        sovalyeler.add("Luna");
        sovalyeler.add("Lupin");
        sovalyeler.add("Molly");
        sovalyeler.add("Arthur");


        ArrayList<String> aktifsovalyeler = new ArrayList<String>();

        Random rand = new Random();
        // aktif şövalyeler seçtirildi
        int n=0;
        for(int i = 0; i < 5; i++){
            int x = rand.nextInt(10-n);// Şövalye sayısından(10 dan) boyut çıkarılarak önceden seçilen elemanların seçilmesini engellendi.
            aktifsovalyeler.add(sovalyeler.get(x));
            sovalyeler.remove(x); //seçilen elemanı sovalyelerden çıkar
            n++; //ilk durumda boyut=0 -->10-0=10 yani 10 taneden seç. ikinci durumda boyut=1 -->10-1=9 yani 9 tane arasından seç
        }
        //for each döngüsüyle aktif şövalyeler yazdırıldı
        for(String a : aktifsovalyeler){
            System.out.println(a);
        }

        Scanner scan = new Scanner (System.in);
        System.out.println("Şövalyenizi değiştirmek isterseniz 1 e, istemezseniz 2 ye basınız.");

        int cevap = scan.nextInt();
        String isim = scan.nextLine();

        if(cevap == 1){
            Scanner input = new Scanner (System.in);
            System.out.println("Değiştirmek istediğiniz şövalyeyi giriniz:");

             String isim1  = input.nextLine();

            System.out.println("Hangi şövalyelerle değiştirmek istiyorsunuz?");
            String isim2  = input.nextLine();
            String isim3  = input.nextLine();
            //burada değiştirilmek istenen şövalye kaldırılarak yerine 2 şövalye eklendi.
            aktifsovalyeler.remove(isim1);
            aktifsovalyeler.add(isim2);
            aktifsovalyeler.add(isim3);




    }
   /* public static void SovalyeyiDegistir(){

       ArrayList<String> aktifsovalyeler = new ArrayList<String>();
        Scanner scan = new Scanner (System.in);
        System.out.println("Şövalyenizi değiştirmek isterseniz 1 e, istemezseniz 2 ye basınız.");

        int cevap = scan.nextInt();
        String isim = scan.nextLine();

        if(cevap == 1){
            Scanner input = new Scanner (System.in);
            System.out.println("Değiştirmek istediğiniz şövalyeyi giriniz:");

            String isim1  = input.nextLine();

            System.out.println("Hangi şövalyelerle değiştirmek istiyorsunuz?");
            String isim2  = input.nextLine();
            String isim3  = input.nextLine();
            //burada değiştirilmek istenen şövalye kaldırılarak yerine 2 şövalye eklendi.
            aktifsovalyeler.remove(isim1);
            aktifsovalyeler.add(isim2);
            aktifsovalyeler.add(isim3);


        }*/
    }


    public void menudenSecimYap() {
        //menü oluşturuldu
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        switch (x) {
            case 1:
                sovalyeleriGoster();
                break;
            case 2:
                aktifSovalyeleriGoster();
                break;
            case 3:
                break;
            case 4:
               // SovalyeyiDegistir();
                break;
    }
    }

    public void sovalyeyiGoster(Sovalye sovalyeler){

    }
    public void oyunDurumunuGoster(ArrayList<Dusman>dusmanlar, ArrayList<Sovalye>sovalyeler){

    }


}
