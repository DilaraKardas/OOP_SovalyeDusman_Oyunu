public class Sovalye extends Karakterler{

    private boolean durum;
    private int vurusHakki;
    private Sans sans;
    private String sovalyeTipi;

        public Sovalye(String ad, int id) {

            super(ad, id);
        }

    public int getVurusHakki() {

            return vurusHakki;
    }

    public void setVurusHakki(int vurusHakki) {

            this.vurusHakki = vurusHakki;
    }
    public void vur(Dusman  dusman){

    }
    public String toString(){
            return "Şövalye adı";
    }
}



