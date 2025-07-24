public class Electronic {
    public Electronic() {
    }
    private String model;
    private String brend;
    private int prise;
    public Electronic(String model, String brend, int prise) {
        this.model = model;
        this.brend = brend;
        this.prise = prise;
    }
    public String getModel() {
        return model;
    }
    public String getBrend() {
        return brend;
    }
    public int getPrise() {
        return prise;
    }
    public void  info(){
    }
}
