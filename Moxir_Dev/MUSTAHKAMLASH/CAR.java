public class CAR{
    public static int avto_umumiy =0;
    public static int avto_eski =0;
    private String model;
    private int yil;
    public int getYil() {
        return yil;
    }
    public String getModel(){
        return model;
    }
    public CAR(int yil,String model){
        this.model = model;
        this.yil = yil;
        avto_umumiy += 1;
        if(yil<=2010) avto_eski+=1;
        System.out.println(avto_umumiy+"-Avtomabil\nModel: "+getModel()+"\tYil: "+getYil());
    }
    static void print(){
        System.out.println("Umumiy Avtomabillar Soni: "+avto_umumiy);
        System.out.println("Yaroqsiz Avtomabillar soni: "+avto_eski);
    }
}