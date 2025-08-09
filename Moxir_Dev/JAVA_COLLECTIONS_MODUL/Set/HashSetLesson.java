import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetLesson {
    public static void main(String[] args) {
        //Set_Topshiriq_1();
        //Set_Topshiriq_2();
        //Set_Topshiriq_3();
        //Set_Topshiriq_4();
        Set_Topshiriq_5();
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
        set.add(0);set.add(3);set.add(5);set.add(6);

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(0);set1.add(3);set1.add(5);set1.add(9);

        Topshiriq4MetodA(set,set1);
        Topshiriq4MetodB(set,set1);
    }
    public static void Topshiriq4MetodA(HashSet<Integer> set,HashSet<Integer> set1){
        ArrayList<Integer> list = new ArrayList<>();
        for(Integer s:set){
            if(set1.contains(s)){
                list.add(s);
            }
        }
        System.out.println("Natija: "+set+"&"+set1+"-> Result = "+list);
    }
    public static void Topshiriq4MetodB(HashSet<Integer> set,HashSet<Integer> set1){
        ArrayList<Integer> list = new ArrayList<>();
        for(Integer s:set){
            if(!set1.contains(s)){
                list.add(s);
            }
        }
        System.out.println("Natija: "+set+"&"+set1+"-> Result = "+list);
    }
    public static void Set_Topshiriq_5(){
        HashSet<Integer> set = new HashSet<>();
        set.add(0);set.add(1);set.add(5);

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(3);set1.add(1);set1.add(7);

        Topshiriq5MetodA(set,set1);
        Topshiriq5MetodB(set,set1);
        Topshiriq5MetodC(set,set1);
    }
    public static void Topshiriq5MetodA(HashSet<Integer> set,HashSet<Integer> set1){
        ArrayList<Integer> list = new ArrayList<>();
        for(Integer s:set){
            if(!set1.contains(s)){
                list.add(s);
            }
        }
        System.out.println("Natija: "+set+"&"+set1+"-> Reult = "+list);
    }
    public static void Topshiriq5MetodB(HashSet<Integer> set,HashSet<Integer> set1){
        ArrayList<Integer> list = new ArrayList<>();
        for(Integer s:set1){
            if(!set.contains(s)){
                list.add(s);
            }
        }
        System.out.println("Natija: "+set+"&"+set1+"-> Reult = "+list);
    }
    public static void Topshiriq5MetodC(HashSet<Integer> set,HashSet<Integer> set1){
        ArrayList<Integer> list = new ArrayList<>();
        int sana =1;
        for(Integer s:set){
            if(sana%2==0){
                list.add(s);
            }
            sana+=1;
        }
        sana =1;
        for(Integer s:set1){
            if(sana%2==0){
                list.add(s);
            }
            sana+=1;
        }
        System.out.println("Natija: "+set+"&"+set1+"-> Reult = "+list);
    }
}
