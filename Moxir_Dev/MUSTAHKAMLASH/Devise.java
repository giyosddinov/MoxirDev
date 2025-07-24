import java.util.SplittableRandom;

public class Devise {
    public Devise() {
    }
    private String brend;
    private double prise;
    private String model;
    public Devise(String brend,double prise,String model){
        this.brend = brend;
        this.model = model;
        this.prise = prise;
    }
    public String getModel(){
        return model;
    }
    public String getBrend(){
        return brend;
    }
    public double getPrise(){
        return prise;
    }
    public void displayInfo(){
        System.out.println("Brend: "+getBrend());
        System.out.println("Model: "+getModel());
        System.out.println("Prise: "+getPrise());
    }
    public double calculeteaksia(double chegirma){
        return prise-prise*(chegirma/100.0);
    }
}
