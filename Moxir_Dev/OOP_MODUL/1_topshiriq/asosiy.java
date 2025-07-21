public class asosiy {
    public asosiy() {
    }
    public asosiy(int a, int b) {
        a = a+b;
        System.out.println(a);
    }
    public static void main(String[] args) {
        Car mashina = new Car();
        person inson = new person();
        uchburchak burchak3 = new uchburchak();

        System.out.println("Car classi!");
        mashina.getmodel("gentra");
        mashina.getrangi("ko'k");
        mashina.getavtomat(false);
        mashina.getnarxi(12000);

        System.out.println("Person classi!");
        inson.getism("javoxir");
        inson.getboy(175);
        inson.getyosh(19);

        System.out.println("Uchburchak classi!");
        burchak3.umumiy(3,4,5);
    }
}
