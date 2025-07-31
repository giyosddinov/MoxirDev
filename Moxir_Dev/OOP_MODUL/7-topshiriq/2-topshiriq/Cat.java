public class Cat extends  Animals{
    public Cat(String name){
        super(name);
    }
    @Override
    public void Sound(){
        System.out.println("meaw meaw");
    }
    @Override
    public String getName(){
        return super.getName();
    }
}
