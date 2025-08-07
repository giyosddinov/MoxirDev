import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Topshiriq_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Listga Nechta Element Yozasiz -> ");
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
            list.add((int)(Math.random()*100));
        }
        System.out.println(list);
        System.out.print("List Ichidan Qidirmoqchi Bo'lgan Elementlarni Kiriting -> ");
        n = scanner.nextInt();
        boolean topildimi=false;
        for(int i=0;i<list.size();i++){
            if(list.get(i)==n){
                topildimi = true;
            }
        }
        if(topildimi){
            System.out.println(n+"Bu Element Listda Mavjud!");
        }
        else {
            System.out.println(n+"Bunday Element Mavjud Emas!");
        }
        ArrayList<Integer> list1  = new ArrayList<>(list);
        Collections.shuffle(list1);
        System.out.println("List dagi Qiymatlar Aralashtirildi!");
        System.out.println(list1);
    }
}
