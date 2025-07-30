public class Kvadrat extends GeometricFigure{
    private double a;
    private double b;
    public Kvadrat(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    @Override
    public double area() {
        return getA()*getB();
    }
    @Override
    public double perimetr() {
        return (getA()+getB())*2;
    }
}
