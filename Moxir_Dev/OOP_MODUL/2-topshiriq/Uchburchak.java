public class Uchburchak {
    private int a;
    private int b;
    private int c;
    private boolean d;
    public Uchburchak() {
    }
    public int getA() {
        return a;
    }
    public boolean isD() {
        return d;
    }
    public int getB() {
        return b;
    }
    public int getC() {
        return c;
    }
    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public void setC(int c) {
        this.c = c;
    }
    public void setD(boolean d) {
        this.d = d;
    }
    public void uchburchak_tekshir(int a, int b, int c){
        if(a+b>c&&a+c>b&&c+b>a) setD(true);
        else setD(false);
    }
    public void uch_burchak_haqida(){
        if(d){
            System.out.println("Peremetr: "+(getA()+getB()+getC()));
            System.out.println("Yuza: "+(getB()*getA()/2));
        }
        else System.out.println("bunday uchuburchak mavjud emas!");
    }
}
