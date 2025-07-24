public class Doctor {
    public Doctor() {}
    private String name;
    private String surname;
    private int oylik;
    public Doctor(String name, String surname, int oylik) {
        this.name = name;
        this.surname = surname;
        this.oylik = oylik;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getOylik() {
        return oylik;
    }
    public void print_info(){
        System.out.println("Doctor Ismi: "+getName());
        System.out.println("Doctor Familyasi: "+getSurname());
        System.out.println("Doctor Oyligi: "+getOylik());
    }
    public String Hunar(){
        return "Doctor";
    }
}
