public class Product {
    public Product(){}
    private String name;
    private double prise;
    public Product(String name,double prise){
        this.name = name;
        this.prise = prise;
    }
    public String getName(){
        return name;
    }
    public double getPrise(){
        return prise;
    }
    public double calculateDiscountPrice(double chegirma){
        return getPrise()-(getPrise()*chegirma*0.001);
    }
    public void displayInfo() {
        System.out.println("Maxsulot nomi: " + getName());
        System.out.println("Maxsulot narxi: " + getPrise());
    }
}
