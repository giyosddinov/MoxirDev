public class Rectangle extends GeometricFigure{
    private double A;
    private double B;
    public Rectangle(double a, double b) {
        this.A = a;
        this.B = b;
    }
    public double getA() {
        return A;
    }
    public double getB() {
        return B;
    }
    @Override
    public double Area(){
        return getA()*getB();
    }
    public double Perimetr(){
        return (getA()+getB())*2;
    }
}
