import java.util.ArrayList;

public class Topshiriq_1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ko'k");
        list.add("Qizil");
        list.add("Yashil");
        list.add("Qora");
        list.add("Oq");
        list.add("Pushti");
        list.add("Sariq");
        for(String s:list){
            System.out.println(s);
        }
        list.set(0,"Kulurang");
        System.out.println("O'zgargan List -> "+list);
        System.out.println("List Uzunligi -> "+list.size());
    }
}
