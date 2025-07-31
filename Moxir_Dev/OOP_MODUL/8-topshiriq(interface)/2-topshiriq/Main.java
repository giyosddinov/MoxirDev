public class Main {
    public static void main(String[] args) {
        BaseConverter kelvin = new Kelvin(123.0);
        System.out.println("Kelvin classi!");
        System.out.println("Kelvin -> "+kelvin.Convert());
        System.out.println("\nFragel classi!");
        BaseConverter fragel = new Fragel(123.0);
        System.out.println("Fragel: "+fragel.Convert());
    }
}
