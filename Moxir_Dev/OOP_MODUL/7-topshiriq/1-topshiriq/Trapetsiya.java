public class Trapetsiya extends GeometricFigure {
    private double A;
    private double B;
    private double H;
    public Trapetsiya(double a, double b, double h) {
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
    private double yon = Math.sqrt(Math.pow(getB()-getA(),2)+Math.pow(getH(),2));
    public double getYon() {
        return yon;
    }
    @Override
    public double area() {
        return (getA()+getB()/2*getH());
    }
    @Override
    public double perimetr() {
        return getB()+getA()+getYon()*2;
    }
}
