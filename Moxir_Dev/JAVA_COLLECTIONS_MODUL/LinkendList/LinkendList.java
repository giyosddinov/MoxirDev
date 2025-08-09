import java.util.*;

public class LinkendList {
    public static void LinkendList5(){
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("d");
        list.add("e");
        list.add("f");
        System.out.println("List -> "+list);

        ArrayList<String> list1 = new ArrayList<>(list);

        System.out.println("ArrayLIst List1 -> "+list1);
        Collections.sort(list);
        System.out.println("LinkendList Saralandi -> "+list);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qidirmoqchi bolgan elementni kiriting -> ");
        String a = scanner.next();
        boolean b = list.equals(a);
        if(b){
            System.out.println("Bunday Element List Ichida Mavjud !");
        }
        else {
            System.out.println("Bunday Element List Ichida Mavjud emas!");
        }
    }
    public static void Topshiriq1Metod1(LinkedList<String> list){
        Collections.shuffle(list);
        System.out.println("List Elementlari Aralashirildi ! List -> "+list);
    }
    public static void LinkendList4(){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(7);

        Topshiriq4Metod2(list);
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(5);
        list1.add(7);
        list1.add(9);
        Topshiriq4Metod1(list,list1);
    }
    public static void Topshiriq4Metod1(LinkedList<Integer> list,LinkedList<Integer> list1){
        list.addAll(list1);
        System.out.println("List -> "+list);
    }
    public static void Topshiriq4Metod2(LinkedList<Integer> list){
        list.removeFirst();
        for(Integer s:list){
            System.out.println(s);
        }
    }
    public static void LinkendList3(){
        LinkedList<String> list = new LinkedList<>();

        list.add("Javoxir");
        list.add("Ali");
        list.add("Vali");
        list.add("Xoji");
        list.add("Sarvar");
        list.add("Samandar");

        Topshiriq3Metod(list,2);
        Topshiriq3Metod2(list);

        list.clear();
        System.out.println("Listdagi barcha MAlumotlar Tozalandi! List -> "+list);
    }
    public static void Topshiriq3Metod2(LinkedList<String> list){
        ArrayList<String> list1 = new ArrayList<>(list);
        list.removeLast();list.removeFirst();
        System.out.println("Listdan Elementlar O'chirildi! List -> "+list);
        System.out.println("O'chirilgan Elementlar! -> "+list1.getFirst()+","+list1.getLast());
    }
    public static void Topshiriq3Metod(LinkedList<String> list,int index){
        list.remove(index);
        System.out.println("List dan Kiritlgan Ibdex O'chirildi! List -> "+list);
    }
    public static void LinkendList2(){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.addFirst(0);
        list.addLast(5);

        System.out.println("List -> "+list);
        System.out.println("List Boshidagi Element : "+list.getFirst()+"\nList Songidagi Element: "+list.getLast());
        Topshiriq2Metod(list);
        list.clear();
    }
    public static void Topshiriq2Metod(LinkedList<Integer> list){
        Collections.reverse(list);
        System.out.println("List Teskari Tartibi -> "+list);
    }
    public static void LinkendList1(){
        LinkedList<String> list = new LinkedList<>();

        list.add("Javoxir");
        list.add("Ali");
        list.add("Vali");
        list.add("Hakim");

        System.out.println("LinkendLint -> ");Topshiriq1Metod(list);

        System.out.println("List Hajmi -> "+list.size());
        System.out.println("List Tozallandi!");
        list.clear();
        System.out.println("LinkendList -> "+list);
    }
    public static void Topshiriq1Metod(LinkedList<String> list){
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        //LinkendList1();
        //LinkendList2();
        //LinkendList3();
        //LinkendList4();
        LinkendList5();
    }
}
