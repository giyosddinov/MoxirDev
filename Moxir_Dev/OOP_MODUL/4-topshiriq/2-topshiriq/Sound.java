public class Sound extends Electronic{
    private String nomi;
    private String name;
    private double davomiyligi;
    private String Turi;
    public Sound(String nomi, String name, double davomiyligi, String Turi) {
        this.nomi = nomi;
        this.name = name;
        this.davomiyligi = davomiyligi;
        this.Turi = Turi;
    }
    public String getNomi() {
        return nomi;
    }
    public String getName() {
        return name;
    }
    public double getDavomiyligi() {
        return davomiyligi;
    }
    public String getTuri() {
        return Turi;
    }
    @Override
    public void info(){}
}
