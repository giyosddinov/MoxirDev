package Mustahkamlash;

import java.util.LinkedList;
import java.util.Scanner;

public class Bemor_Servise {
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
        System.out.println("Nuroniy Bemor -> "+bemor.getIsm()+"-"+bemor.getYosh()+"-"+bemor.getKassalik());
    }

}
