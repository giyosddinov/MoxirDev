public class ElectronicProduct extends Product {
    private int warrty;
    private boolean hasBattarey;
    public ElectronicProduct(String name,double prise,int warrty,boolean hasBattarey){
        super(name,prise);
        this.hasBattarey = hasBattarey;
        this.warrty = warrty;
    }
    public int getWarrty(){
        return warrty;
    }
    public boolean getHasBattarey(){
        return hasBattarey;
    }
    @Override
    public void displayInfo(){
        System.out.println("Maxsulot Nomi: "+getName());
        System.out.println("Maxsulot Narxi: "+getPrise());
        System.out.println("Maxsulot MUdati: "+getWarrty());
        System.out.println("Maxsulotda quvatlagich: "+(getHasBattarey()?"Bor":"Yoq"));
    }
}
