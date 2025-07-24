public class Animal {
    public Animal(){}
    private String nom;
    private int age;
    public Animal(String nom,int age){
        this.age = age;
        this.nom = nom;
    }
    public String getNom(){
        return nom;
    }
    public int getAge(){
        return age;
    }
    public void Speak(){
        System.out.println("hayvon tuvushi");
    }
    public void info(){
        System.out.println("Hayvon nomi: "+getNom());
        System.out.println("Hayvon yoshi: "+getAge());
    }
}
