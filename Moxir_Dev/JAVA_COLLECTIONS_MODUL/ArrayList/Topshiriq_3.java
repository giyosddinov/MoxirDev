import java.util.ArrayList;
import java.util.Collections;

public class Topshiriq_3 {
    public void Array_Metod(ArrayList<Integer> list){
        Collections.reverse(list);
        System.out.println(list);
    }
    public ArrayList<Integer> Qiymat_Kes(int First_Index,int Last_Index,ArrayList<Integer> list){
        return new ArrayList<>(list.subList(First_Index,Last_Index));
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(1);

        System.out.println("Siz Kiritgan List -> "+list);
        System.out.print("A Metod Yangilagan List -> ");
        Topshiriq_3 metod = new Topshiriq_3();
        metod.Array_Metod(list);
        System.out.println("B Metod Yangilangan List -> "+metod.Qiymat_Kes(1,3,list));

    }
}
