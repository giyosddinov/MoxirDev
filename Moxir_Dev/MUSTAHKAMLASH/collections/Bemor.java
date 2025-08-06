package Mustahkamlash;

import java.util.LinkedList;
import java.util.Scanner;

public class Bemor {
    public Bemor() {
    }
    private String ism;
    private int yosh;
    private String kassalik;
    public Bemor(String ism, int yosh, String kassalik) {
        this.ism = ism;
        this.yosh = yosh;
        this.kassalik = kassalik;
    }
    public String getIsm() {
        return ism;
    }
    public void setIsm(String ism) {
        this.ism = ism;
    }
    public int getYosh() {
        return yosh;
    }
    public void setYosh(int yosh) {
        this.yosh = yosh;
    }
    public String getKassalik() {
        return kassalik;
    }
    public void setKassalik(String kassalik) {
        this.kassalik = kassalik;
    }
    Scanner scanner = new Scanner(System.in);
    public void Bemor_Qoshish(LinkedList<Bemor> list){
        System.out.print("Bemorning Ismi -> ");
        String ism = scanner.next();
        System.out.print("Bemorning Yoshi -> ");
        int yosh = scanner.nextInt();
        System.out.print("Bemorning Kassaligi -> ");
        String kassalik = scanner.next();
        Bemor bemor = new Bemor(ism,yosh,kassalik);
        list.addLast(bemor);
        System.out.println("Bemor Qoshildi!");
    }
    public void Chiqarib_tashlash(LinkedList<Bemor> list){
        list.removeLast();
        System.out.println("Songi Bemor chiqarib Tashlandi!");
    }
    public void Barcha_Bemorlar(LinkedList<Bemor> list){
        for(Bemor s:list){
            System.out.println(s.getIsm()+"-"+s.getYosh()+"-"+s.getKassalik());
        }
    }
    public void Nuroniy_Bemor(LinkedList<Bemor> list,Bemor bemor){
        for(int i=0;i<list.size();i++){
            if (bemor.getYosh()<list.get(i).getYosh()){
                bemor = list.get(i);
            }
        }
        System.out.println("Nuroniy Bemor -> "+bemor.getIsm()+"-"+getYosh()+"-"+getKassalik());
    }

    public static void main(String[] args) {
        LinkedList<Bemor> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        Bemor_Servise bemorServise= new Bemor_Servise();
        Bemor test = new Bemor();
        test.setYosh(0);
        System.out.println("1. Navbatga bemor qo‘shish\n" +
                "3. Oxirgi bemorni chiqarib tashlash\n" +
                "4. Navbatdagi barcha bemorlarni ko‘rish\n" +
                "5. Eng katta yoshdagi bemorni topish\n" +
                "6. Dasturdan chiqish");
        int n = scanner.nextInt();
         switch (n){
            case 1:bemorServise.Bemor_Qoshish(list);bemorServise.Barcha_Bemorlar(list);break;
            case 3:bemorServise.Chiqarib_tashlash(list);break;
            case 4:bemorServise.Barcha_Bemorlar(list);break;
            case 5:bemorServise.Nuroniy_Bemor(list,test);break;
            case 6:
                System.out.println("Tizimdan chidi!"); break;
        }
    }
}
