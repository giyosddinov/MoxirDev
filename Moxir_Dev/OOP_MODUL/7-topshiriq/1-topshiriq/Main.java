public class Main {
    public static void main(String[] args) {
        System.out.println("Uchburchak classi!");
        GeometricFigure uchuburchak  = new Rectengle(3.0,4.0,5.0);
        System.out.println("Yuza: "+uchuburchak.area());
        System.out.println("Perimetr: "+uchuburchak.perimetr());
        System.out.println("\nKvadrat classi!");
        GeometricFigure kvadrat = new Kvadrat(4.0,4.0);
        System.out.println("Yuza: "+kvadrat.area());
        System.out.println("Perimetr: "+kvadrat.perimetr());
        System.out.println("\nTrapetsiya classi!");
        GeometricFigure trapetsiya = new Trapetsiya(16.0,4.0,12.0);
        System.out.println("Yuza: "+trapetsiya.area());
        System.out.println("Perimetr: "+trapetsiya.perimetr());
    }
}
