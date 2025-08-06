package Mustahkamlash;

public class Student {
    public Student() {
    }
    private int baxo;
    private String ism;
    public Student(int baxo, String ism) {
        this.baxo = baxo;
        this.ism = ism;
    }
    public int getBaxo() {
        return baxo;
    }
    public void setBaxo(int baxo) {
        this.baxo = baxo;
    }
    public String getIsm() {
        return ism;
    }
    public void setIsm(String ism) {
        this.ism = ism;
    }

}
