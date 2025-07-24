public class triangle extends GeometricFigure {
    private double A;
    private double B;
    private double C;
    public triangle(double a, double b, double c) {
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
    public double Perimetr(){
        return getA()+getB()+getC();
    }
    @Override
    public double Area(){
        double p = (getA()+getC()+getB())/2;
        return Math.sqrt(p*(p-getC())*(p-getB())*(p-getA()));
    }
}
