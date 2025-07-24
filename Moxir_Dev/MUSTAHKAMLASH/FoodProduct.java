public class FoodProduct extends Product {
    private int muddat;
    private boolean isHalal;
    public FoodProduct(String name,double prise,int muddat,boolean isHalal){
        super(name,prise);
        this.isHalal = isHalal;
        this.muddat = muddat;
    }
    public int getMuddat(){
        return muddat;
    }
    public boolean getIsHalal(){
        return isHalal;
    }
    @Override
    public void displayInfo(){
        System.out.println("Maxsulot nomi: "+getName());
        System.out.println("Maxsulot narxi: "+getPrise());
        System.out.println("Maxsulot Halol/Xarom: "+(getIsHalal()?"Halal":"Xaram"));
        System.out.println("Mudati: "+(getMuddat()>14?"yaroqli":"yaroqsiz"));
    }
}
