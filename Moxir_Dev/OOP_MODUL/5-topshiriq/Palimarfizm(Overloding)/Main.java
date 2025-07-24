public class Main {
    public static void main(String[] args) {
        MathFunctions mathFunctions = new MathFunctions();
        System.out.println(mathFunctions.add(2,3));
        System.out.println(mathFunctions.add(10000,10000000));
        System.out.println(mathFunctions.add(3.2,4));
        System.out.println(mathFunctions.add(4.5,6.7));
        System.out.println(mathFunctions.add(5,6.7));
        System.out.println(mathFunctions.add(77.8,66.5));
        System.out.println("\n\t\tKeyingi Metod\n");
        System.out.println(mathFunctions.sub(5,7));
        System.out.println(mathFunctions.sub(5.4,6.7));
        System.out.println(mathFunctions.sub(8,7.5));
        System.out.println(mathFunctions.sub(6.8,6));
        System.out.println(mathFunctions.sub(1000000000,1000000000));
        System.out.println(mathFunctions.sub(6.7,4.5));
        System.out.println("\n\t\tKeyingi Metod\n");
        System.out.println(mathFunctions.multiply(4,5));
        System.out.println(mathFunctions.multiply(6,7.8));
        System.out.println(mathFunctions.multiply(4.5,6.7));
        System.out.println(mathFunctions.multiply(5.6,6));
        System.out.println("\n\t\tKeyingi Metod\n");
        System.out.println(mathFunctions.div(20,4));
        System.out.println(mathFunctions.div(20.6,0.4));
        System.out.println(mathFunctions.div(5,0.5));
        System.out.println(mathFunctions.div(20.0,2));
        System.out.println("\n\t\tKeyingi Metod\n");
        System.out.println(mathFunctions.abs(-5));
        System.out.println(mathFunctions.abs(-4.5));
        System.out.println("\n\t\tKeyingi Metod\n");
        System.out.println(mathFunctions.pow(4));
        System.out.println(mathFunctions.pow(2.8));
    }
}
