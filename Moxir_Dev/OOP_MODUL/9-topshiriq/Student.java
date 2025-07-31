public class Student extends Person{
    private String programs;
    private int year;
    private double fee;
    public Student(String name, String address, String programs, int year, double fee) {
        super(name, address);
        this.programs = programs;
        this.year = year;
        this.fee = fee;
    }
    public String getPrograms() {
        return programs;
    }
    public int getYear() {
        return year;
    }
    public double getFee() {
        return fee;
    }
    public void setPrograms(String programs) {
        this.programs = programs;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }
    @Override
    public String toString(){
        return "Student[Person[Name="+getName()+",Address="+getAddress()+"],Program="+getPrograms()+",Year="+getYear()+",Fee="+getFee()+"]";
    }
}
