public class Animals {
    private String name;
    public Animals(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void Sound(){
        System.out.println("tovush");
    }

    public static void main(String[] args) {
        System.out.println("Dog classi!");
        Animals kuchuk = new Dog("abchalka");
        System.out.println("Ismi: "+kuchuk.getName());
        System.out.print("Tovushi: ");kuchuk.Sound();
        System.out.println("\nCat classi!");
        Cat cat = new Cat("kisa");
        System.out.println("Ismi: "+cat.getName());
        System.out.print("Tovushi: ");cat.Sound();
        System.out.println("\nDuck classi!");
        Duck duck= new Duck("o'rdak") ;
        System.out.println("Ismi: "+duck.getName());
        System.out.print("Tovushi: ");duck.Sound();
    }
}