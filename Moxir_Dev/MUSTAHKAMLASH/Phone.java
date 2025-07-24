public class Phone extends Devise {
    private int camera;
    private int battarey;
    private boolean g5;
    public Phone(){};
    public Phone(String brend,String model,int prise,int camera,int battarey,boolean g5){
        super(brend,prise,model);
        this.battarey = battarey;
        this.g5 = g5;
        this.camera = camera;
    }
    public boolean getG5(){
        return g5;
    }
    public int getCamera(){
        return camera;
    }
    public int getBattarey(){
        return battarey;
    }
    @Override
    public void displayInfo(){
        System.out.println("Brend: "+getBrend());
        System.out.println("Model: "+getModel());
        System.out.println("Prise: "+getPrise());
        System.out.println("Camera: "+getCamera());
        System.out.println("Battarey: "+getBattarey());
        System.out.println("Aloqa: "+(getG5()?"5G":"4G"));
        System.out.print("Aksiya narxida: "+calculeteaksia(getPrise()));
    }
}
