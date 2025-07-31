public class Kelvin implements BaseConverter{
    private double selsi;
    public Kelvin(double selsi) {
        this.selsi = selsi;
    }
    public double getSelsi() {
        return selsi;
    }
    @Override
    public double Convert() {
        return getSelsi()+273.15;
    }
}
