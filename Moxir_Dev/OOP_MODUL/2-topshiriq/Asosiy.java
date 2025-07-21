public class Asosiy {
    public static void main(String[] args) {
        Car car = new Car();
        Uchburchak uchburchak = new Uchburchak();
        Point point = new Point();
        System.out.println("Car classi!");
        car.setmexanic(true);
        car.setRang("yashil");
        car.setNarxi(1200);
        car.setModel("Cobalt");
        car.print();
        System.out.println("Uchburchak classi!");
        uchburchak.setA(3);
        uchburchak.setB(4);
        uchburchak.setC(5);
        uchburchak.uchburchak_tekshir(uchburchak.getA(), uchburchak.getB(), uchburchak.getC());
        uchburchak.uch_burchak_haqida();
        System.out.println("Point classi!");
        point.setX(10.0);
        point.setY(5.5);
        point.setZ(7.8);
        point.print();
        System.out.println("Tugadi!");
    }
}
