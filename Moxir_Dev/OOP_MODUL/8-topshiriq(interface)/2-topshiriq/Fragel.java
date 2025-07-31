public class Fragel implements BaseConverter{
    private double selsi;
    public Fragel(double selsi) {
        this.selsi = selsi;
    }
    public double getSelsi() {
        return selsi;
    }
    @Override
    public double Convert(){
        return getSelsi()*9/5+32.0;
    }
}
