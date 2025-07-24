public class LoundSpeak extends Sound{
    private String a;
    public LoundSpeak(String nomi, String name, double davomiyligi, String Turi, String a) {
        super(nomi,name, davomiyligi, Turi);
        this.a = a;
    }
    public String getA() {
        return a;
    }
    @Override
    public void info() {
        System.out.println("Qoshiq Nomi: "+getNomi());
        System.out.println("Qoshiq Vaqti: "+getDavomiyligi());
        System.out.println("Qoshiq Turi: "+getTuri());
        System.out.println("Qoshiq Balandligi: "+getA());
        System.out.println("Qoshiqchi: "+getName());
    }
}
