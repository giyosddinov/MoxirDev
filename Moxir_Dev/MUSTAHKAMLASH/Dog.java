public class Dog extends Animal{
    private String bred;
    public Dog(String nom,int age,String bred){
        super(nom,age);
        this.bred = bred;
    }
    public String getBred(String bred){
        return bred;
    }
    @Override
    public void Speak(){
        System.out.println("Vov-Vov!");
    }
    @Override
    public void info(){
        System.out.println("Kuchuk nomi: "+getNom());
        System.out.println("kuchuk Yoshi: "+getAge());
        System.out.println("Kuchuk Zoti: "+getBred("apchalka"));
        System.out.print("Tovush: ");
        Speak();
    }
}
