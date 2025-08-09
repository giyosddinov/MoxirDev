import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetLesson {
    public static void main(String[] args) {
        //Set_Topshiriq_1();
        //Set_Topshiriq_2();
        //Set_Topshiriq_3();
        Set_Topshiriq_4();
    }
    public static void Set_Topshiriq_1(){
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        set.add(4);
        set.add(1);
        set.add(34);
        set.add(9);
        System.out.println("HashSet: ");
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            int a = iterator.next();
            System.out.print(a+",");
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.reverse(list);
        System.out.println("Teskari Tartibi -> "+list);
    }
    public static void Set_Topshiriq_2(){
        HashSet<String> set = new HashSet<>();
        set.add("Javoxir");
        set.add("Ali");
        set.add("Vali");
        set.add("Hasan");
        set.add("Husan");
        System.out.println("Set Uzunligi -> "+set.size());
        boolean a = set.isEmpty();
        String soz="Set Bo'sh";
        if(!a){
            soz = "Set Bo'sh Emas";
        }
        System.out.println("Set Boshmi Yoki Yoq -> "+soz);
        set.clear();
        System.out.println("Set ning Barcha Elementlari Tozalandi!");
    }
    public static void Set_Topshiriq_3(){
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        HashSet<Integer> cloneset = (HashSet<Integer>) set.clone();
        cloneset.add(5);
        cloneset.add(6);
        cloneset.add(7);

        ArrayList<Integer> list = new ArrayList<>(cloneset);
        System.out.print("Faqat Juft O'rindagi Elementlar -> ");
        for(int i=0;i<list.size();i++){
            if(i%2==0){
                System.out.print(list.get(i)+" ");
            }
        }
    }
    public static void Set_Topshiriq_4(){
        HashSet<Integer> set = new HashSet<>();
        
    }
    public static void Topshiriq4MetodA(){

    }
    public static void Topshiriq4MetodB(){

    }
    public static void Set_Topshiriq_5(){

    }
}
