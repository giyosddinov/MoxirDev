public class Compyuter extends Electronic{
    private int ram;
    private int hz;
    private boolean GPU;
    private int SSD;
    public Compyuter(String model, String brend, int prise,int ram,int hz,boolean GPU,int SSD){
        super(model,brend,prise);
        this.GPU = GPU;
        this.hz = hz;
        this.ram = ram;
        this.SSD = SSD;
    }
    public int getRam() {
        return ram;
    }
    public int getHz() {
        return hz;
    }
    public boolean isGPU() {
        return GPU;
    }
    public int getSSD() {
        return SSD;
    }
    @Override
    public void info(){
    }
}
