public class Cat extends Animal{
    private String color;
    public Cat(String nom,int age,String color){
        super(nom,age);
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    @Override
    public void Speak(){
        System.out.println("Meau!");
    }
    @Override
    public void info(){
        System.out.println("Hayvon nomi: "+getNom());
        System.out.println("Hayovn Rangi: "+getColor());
        System.out.print("tovush: ");
        Speak();
    }
}
