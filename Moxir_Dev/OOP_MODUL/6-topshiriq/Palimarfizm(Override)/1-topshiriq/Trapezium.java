public class Trapezium extends GeometricFigure{
    private double A;
    private double B;
    private double H;
    public Trapezium(double a, double b, double h) {
        this.A = a;
        this.B = b;
        this.H = h;
    }
    public double getA() {
        return A;
    }
    public double getB() {
        return B;
    }
    public double getH() {
        return H;
    }
    @Override
    public double Area(){
        return (getA()+getB())*getH()/2;
    }
    @Override
    public double Perimetr(){
        double asosf = (getA()-getB())/2;
        double c = Math.sqrt(asosf*asosf+getH()*getH());
        return getA()+getB()+c*2;
    }
}
