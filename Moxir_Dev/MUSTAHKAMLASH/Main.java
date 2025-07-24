import java.awt.print.PrinterJob;

public class Main{
    public static void main(String[] args) {
        LapTop[] laptop = new LapTop[2];
        Phone[] phones = new Phone[2];
        phones[0] = new Phone("Samsung","A25",120,120,120,true);
        phones[1] = new Phone("Iphone","16Pro",800,300,10,false);
        laptop[0] = new LapTop("Hp",800,"Victus",32,true);
        laptop[1] = new LapTop("Lenovo",100,"lenobo",8,false);
        phones[0].displayInfo();
        System.out.println();
        phones[1].displayInfo();
        System.out.println();
        laptop[0].displayInfo();
        System.out.println();
        laptop[1].displayInfo();
    }
}