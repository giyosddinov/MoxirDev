import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Collections;

public class Topshiriq_5 {
    public void Orin_Almashtir(ArrayList<Integer> list,int indexa,int indexb){
        int temp = list.get(indexa);
        list.set(indexa, list.get(indexb));
        list.set(indexb, temp);
        System.out.println("Qiymatlar almashtirildi!");
        System.out.println("List -> "+list);
    }
    public void Almashtir(ArrayList<Integer> list,ArrayList<Integer> list1){
        list.addAll(list1);
        System.out.println("Birlashgan LIst -> "+list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(3);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("List -> "+list);
        list.ensureCapacity(6);
        list.add(4);list.add(5);list.add(6);
        System.out.println("List -> "+list);

        Topshiriq_5 metod = new Topshiriq_5();
        metod.Orin_Almashtir(list,0,3);
        ArrayList<Integer> list1 = new ArrayList<>(Collections.nCopies(3,0));
        metod.Almashtir(list,list1);
    }
}