public class Pc extends Compyuter{
    private boolean Keyboard;
    public Pc(String model, String brend, int prise,int ram,int hz,boolean GPU,int SSD,boolean Keyboard){
        super(model,brend,prise,ram,hz,GPU,SSD);
        this.Keyboard = Keyboard;
    }
    public boolean isKeyboard() {
        return Keyboard;
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
        System.out.println("Keyboard: "+(isKeyboard()?"Bor":"Yoq"));
    }
}