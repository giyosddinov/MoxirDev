public class GeometricFigure {
    public GeometricFigure() {
    }
    public double Area(){
        return 0;
}
    public double Perimetr(){
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("Triangel classi!");
        GeometricFigure uchburchak = new triangle(4.0,3.0,5.0);
        System.out.println("Area: "+uchburchak.Area());
        System.out.println("Perimetr: "+uchburchak.Perimetr());
        GeometricFigure tortburchak = new Rectangle(4.0,4.0);
        System.out.println("Rectengl classi!");
        System.out.println("Area: "+tortburchak.Area());
        System.out.println("Perimetr: "+tortburchak.Perimetr());
        System.out.println("Trapetsiya classi!");
        GeometricFigure trapezium = new Trapezium(10.0,6.0,4.0);
        System.out.println("Area: "+trapezium.Area());
        System.out.println("Perimetr: "+trapezium.Perimetr());
    }
}
