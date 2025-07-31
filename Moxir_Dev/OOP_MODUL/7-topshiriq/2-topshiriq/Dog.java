public class Dog extends Animals{
    public Dog(String name){
        super(name);
    }
    @Override
    public String getName(){
        return super.getName();
    }
    @Override
    public void Sound(){
        System.out.println("bow bow!");
    }

    public static void main(String[] args) {
        Animals dog = new Dog("abchalka");
        System.out.println("Ism: "+dog.getName());
        System.out.println("Tovush: ");dog.Sound();
        System.out.println("\nCat classi!");
        Animals cat = new Cat("Kisa");
        System.out.println("Ism: "+cat.getName());
        System.out.println("Tovushi: ");cat.Sound();
        System.out.println("\nDuck classi!");
        Animals duck  = new Duck("ordak");
        System.out.println("Ism: "+duck.getName());
        System.out.println("Tovushi: ");duck.Sound();
    }
}