package Mustahkamlash;

public class Kitob {
    public Kitob() {
    }
    private String nomi;
    private String mualif;
    private boolean olinganmi;
    private int yil;
    public Kitob(String nomi, String mualif, boolean olinganmi, int yil) {
        this.nomi = nomi;
        this.mualif = mualif;
        this.olinganmi = olinganmi;
        this.yil = yil;
    }
    public String getNomi() {
        return nomi;
    }

    public void setNomi(String nomi) {
        this.nomi = nomi;
    }

    public String getMualif() {
        return mualif;
    }

    public void setMualif(String mualif) {
        this.mualif = mualif;
    }

    public boolean isOlinganmi() {
        return olinganmi;
    }

    public void setOlinganmi(boolean olinganmi) {
        this.olinganmi = olinganmi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

}
