public class Dog extends Animals {
    public Dog(String name){
        super(name);
    }
    @Override
    public void Sound(){
        System.out.println("bow bow!");
    }
    @Override
    public String getName(){
        return super.getName();    }

}
