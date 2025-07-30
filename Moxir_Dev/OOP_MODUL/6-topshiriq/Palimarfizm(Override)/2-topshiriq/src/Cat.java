public class Cat extends Animals{
    public Cat(String name){
        super(name);
    }
    public void Sound(){
        System.out.println("meaw meaw!");
    }
    public String getName(){
        return super.getName();
    }
}
