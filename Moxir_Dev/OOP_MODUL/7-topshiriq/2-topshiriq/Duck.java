public class Duck extends Animals{
    public Duck(String name){
        super(name);
    }
    @Override
    public void Sound(){
        System.out.println("quak quak");
    }
    @Override
    public String getName(){
        return super.getName();
    }
}
