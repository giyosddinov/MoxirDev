package Mustahkamlash;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Nechta student Kiritasiz? ");
        n = scanner.nextInt();
        Student[]  students = new Student[n];
        ArrayList<Student> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ism;int baxo;
            System.out.println(i+1+"Student Malumotlari!");
            System.out.print("Ism -> ");
            ism = scanner.next();
            System.out.print("Baxo -> ");
            baxo = scanner.nextInt();
            Student s = new Student(baxo,ism);
            students[i]  =s;
            list.add(s);
        }
        nimadir nima = new nimadir();
        nima.Barcha_Talaba(list);
        nima.ortacha_baxo(list);
        nima.alochi_student(list);
        nima.saralash(list);
        nima.engYuqriTalaba(list);
    }
}
