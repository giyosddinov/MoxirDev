public class Staff extends Person{
    private String school;
    private double pay;
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }
    public String getSchool() {
        return school;
    }
    public double getPay() {
        return pay;
    }
    public void setSchoool(String schoool) {
        this.school = schoool;
    }
    public void setPay(double pay) {
        this.pay = pay;
    }
    @Override
    public String toString(){
        return "[Saff[Person[Name="+getName()+",Address="+getAddress()+"],School="+getSchool()+",Pay="+getPay()+"]";
    }

    public static void main(String[] args) {
        Person student = new Student("Javoxir","Zangi Ota","Tatu",18,2.802);
        System.out.println("Person classi!");
        System.out.println(student.toString());
        System.out.println("\nStaff classi!");
        Person staff = new Staff("Ali","YangiYol","42-maktab",4);
        System.out.println(staff.toString());
    }
}