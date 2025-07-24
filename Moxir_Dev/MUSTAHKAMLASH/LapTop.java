public class LapTop extends Devise {
    public LapTop(){}
    private int ram;
    private boolean GPU;
    public LapTop(String brend,double prise,String model,int ram,boolean GPU){
        super(brend,prise,model);
        this.GPU = GPU;
        this.ram = ram;
    }
    public int getRam(){
        return ram;
    }
    public boolean getGPU(){
        return GPU;
    }
    @Override
    public void displayInfo(){
        System.out.println("Brend: "+getBrend());
        System.out.println("Model: "+getModel());
        System.out.println("Prise: "+getPrise());
        System.out.println("Ram: "+getRam());
        System.out.println("GPU: "+(getGPU()?"Bor":"Yoq"));
        System.out.println("Aksiya Prise: "+calculeteaksia(getPrise()));
    }
}
