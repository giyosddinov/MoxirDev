package Mustahkamlash;

public class Maxsulotlar {
    public Maxsulotlar() {
    }
    private String nomi;
    private int miqdor;
    private double narx;
    public Maxsulotlar(String nomi, int miqdor, double narx) {
        this.nomi = nomi;
        this.miqdor = miqdor;
        this.narx = narx;
    }
    public String getNomi() {
        return nomi;
    }
    public double getNarx() {
        return narx;
    }
    public int getMiqdor() {
        return miqdor;
    }
    public void setNomi(String nomi) {
        this.nomi = nomi;
    }
    public void setMiqdor(int miqdor) {
        this.miqdor = miqdor;
    }
    public void setNarx(double narx) {
        this.narx = narx;
    }

}