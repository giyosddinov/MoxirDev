public class Rectengle extends GeometricFigure{
    private double A;
    private double B;
    private double C;
    public Rectengle(double a, double b, double c) {
        this.A = a;
        this.B = b;
        this.C = c;
    }
    public double getA() {
        return A;
    }
    public double getB() {
        return B;
    }
    public double getC() {
        return C;
    }
    @Override
    public double area() {
        double p = (getA()+getB()+getC())/2;
        return Math.sqrt(p*(p-getC())*(p-getB())*(p-getA()));
    }
    @Override
    public double perimetr() {
        return getB()+getA()+getC();
    }
}
