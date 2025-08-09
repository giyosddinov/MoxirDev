import java.util.*;

public class MapLesson {
    public static void main(String[] args) {
        //MapTopshiriq1();
        //MapTopshiriq2();
        //MapTopshiriq3();
        MapTopshiriq4();
    }
    public static void MapTopshiriq1(){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Javoxir");
        map.put(2,"Ali");
        map.put(3,"Vali");
        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+"-"+m.getValue());
        }
        System.out.println("Map Uzunligi -> "+map.size());
    }
    public static void Topshiriq2Metod(HashMap<Integer,String> map ,HashMap<Integer,String> map1) {
        map.putAll(map1);
        map1.clear();
        for (Map.Entry M : map.entrySet()) {
            System.out.println(M.getKey() + "-" + M.getValue());
        }
        System.out.println("Map Tozalandi!");
        map.clear();
        for (Map.Entry M : map.entrySet()) {
            System.out.println(M.getKey() + "-" + M.getValue());
        }
    }
    public static void MapTopshiriq2(){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Javoxir");
        map.put(2,"Ali");
        map.put(3,"Bobur");

        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(4,"G'ani");
        map1.put(5,"elnur");
        map1.put(6,"Aziz");

        Topshiriq2Metod(map,map1);
    }
    public static void Topshiriq3metod(HashMap<Integer,String> map ){
        ArrayList<Map.Entry<Integer,String >> entrymap = new ArrayList<>(map.entrySet());
        System.out.println("ArrayList -> "+entrymap);
    }
    public static void MapTopshiriq3(){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Javoxir");
        map.put(2,"Ali");
        map.put(3,"Bobur");
        Topshiriq3metod(map);
    }
    public static void MapTopshiriq4(){
        TreeMap<Integer,String > map  = new TreeMap<>();
        map.put(1,"Javoxir");
        map.put(2,"Ali");
        map.put(3,"Vali");
        map.put(4,"G'ani");

        Map.Entry<Integer,String> first = map.firstEntry();
        Map.Entry<Integer,String> last = map.lastEntry();
        System.out.println("Birinchi Element = "+first+"\nSo'ngi Element = "+last);
        System.out.println("Map Teskari Tartibi -> "+map.reversed());
    }
    public static void MapTopshiriq5(){

    }
}
