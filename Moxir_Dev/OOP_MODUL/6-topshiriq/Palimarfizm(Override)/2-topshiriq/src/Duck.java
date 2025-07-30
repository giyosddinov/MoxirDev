public class Duck extends Animals{
    public Duck(String name){
        super(name);
    }
    public void Sound(){
        System.out.println("quack quack!");
    }
    public String getName(){
        return super.getName();
    }
}
