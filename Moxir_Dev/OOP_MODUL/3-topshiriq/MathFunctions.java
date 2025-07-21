public class MathFunctions {
    public MathFunctions() {
    }
    private static double pi = 3.14159265359;
    private static double e  = 2.71828182846;
    public MathFunctions(double pi,double e){
        this.pi=pi;
        this.e = e;
    }
    static double Daraja(int a){
        double qiymat = e;
        for(int i=1;i<=a;i++){
            qiymat*=e;
        }
        return qiymat;
    }
    static double Aylan(double r){
        return pi*r*r;
    }
    static double Geron(double a,double b,double c){
        if(!(a+b>c&&b+c>a&&a+c>b)){
            System.out.println("bunday uchburchak mavjud emas!");
            System.exit(0);
        }
        double p = (a+b+c)/2;
        return Math.sqrt((p*(p-a)*(p-b)*(p-c)));
    }
}
