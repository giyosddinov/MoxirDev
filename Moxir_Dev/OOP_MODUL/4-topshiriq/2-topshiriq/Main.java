public class Main {
    public static void main(String[] args) {
        System.out.println("Birinchi topshiriq");
        LapTop lapTop = new LapTop("Victus","HP",800,8,144,false,64,6,true);
        lapTop.info();
        Pc pc = new Pc("LG","LG",1200,4,72,true,64,true);
        System.out.println("");
        pc.info();
        System.out.println("Ikkinchi topshiriq");
        Subwooer subwooer = new Subwooer("Nimadir","Munisa",4.2,"Bass","Pass");
        subwooer.info();
        System.out.println("");
        LoundSpeak loundSpeak = new LoundSpeak("Nimadir","jasur",3.1,"Rep","Juda Baland");
        loundSpeak.info();
    }
}
