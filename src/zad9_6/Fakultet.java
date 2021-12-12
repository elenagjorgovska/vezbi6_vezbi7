package zad9_6;

public class Fakultet {
    private String ime;
    private int brojNaSmerovi;
    private int vkupnoStudenti;

    public Fakultet (String ime, int brojNaSmerovi, int vkupnoStudenti) {
        this.ime = ime;
        this.brojNaSmerovi = brojNaSmerovi;
        this.vkupnoStudenti = vkupnoStudenti;
    }

    public String getIme() {
        return ime;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public int getBrojNaSmerovi() {
        return brojNaSmerovi;
    }
    public void setBrojNaSmerovi(int brojNaSmerovi) {
        this.brojNaSmerovi = brojNaSmerovi;
    }
    public int getVkupnoStudenti() {
        return vkupnoStudenti;
    }
    public void setVkupnoStudenti(int vkupnoStudenti) {
        this.vkupnoStudenti = vkupnoStudenti;
    }
}


