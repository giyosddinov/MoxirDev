public class Lor extends Doctor{
    public Lor(String name, String surname, int oylik){
        super(name,surname,oylik);
    }
    @Override
    public String Hunar(){
        return "Lor";
    }
    @Override
    public void print_info(){
        System.out.println("Doctor Ismi: "+getName());
        System.out.println("Doctor Familyasi: "+getSurname());
        System.out.println("Doctor Daromadi: "+getOylik());
        System.out.println("Doctor Hunari: "+Hunar());
    }
}
