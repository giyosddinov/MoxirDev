import java.util.ArrayList;
import java.util.Scanner;

public class Topshiriq_4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ikkta Listga Nechta Element Yozasiz-> ");

        int n = scanner.nextInt();
        System.out.println("Birinchi Listga Malumotlar Kiriting!");
        for(int i=0;i<n;i++){
            System.out.print(i+1+"-elementni kiriting -> ");
            String qiymat= scanner.next();
            list.add(qiymat);
        }

        System.out.println("Birinchi Listga Malumotlar Kiriting!");
        ArrayList<String> list1 = new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.print(i+1+"-elementni kiriting -> ");
            String qiymat= scanner.next();
            list1.add(qiymat);
        }

        ArrayList<String> list2 = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(list.get(i).equalsIgnoreCase(list1.get(i))){
                list2.add("yes");
            }
            else {
                list2.add("no");
            }
        }
        System.out.println(list+"-"+list1+" -> Result = "+list2);
    }
}
