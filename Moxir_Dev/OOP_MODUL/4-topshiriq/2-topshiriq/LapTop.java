public class LapTop extends Compyuter{
    private int battrey;
    private boolean touchScreen;
    public LapTop(String model, String brend, int prise,int ram,int hz,boolean GPU,int SSD,int battrey,boolean touchScreen){
        super(model,brend,prise,ram,hz,GPU,SSD);
        this.battrey =battrey;
        this.touchScreen = touchScreen;
    }
    public int getBattrey() {
        return battrey;
    }
    public boolean isTouchScreen() {
        return touchScreen;
    }
    @Override
    public void info(){
        System.out.println("Brend: "+getBrend());
        System.out.println("Model: "+getModel());
        System.out.println("Prise: "+getPrise());
        System.out.println("Keyboard: "+(isGPU()?"Bor":"Yoq"));
        System.out.println("Ram: "+getRam());
        System.out.println("Ekran: "+getHz()+"hz");
        System.out.println("SSD: "+getSSD());
        System.out.println("Battarey(Kun): "+getBattrey());
        System.out.println("TouchScreean: "+(isTouchScreen()?"Sensor":"Sensor Yoq"));
    }
}