package Mustahkamlash;

import java.util.LinkedList;
import java.util.Scanner;

public class Kitob_Servise {
    Scanner scanner = new Scanner(System.in);
    public void Malumot(){
        LinkedList<Kitob> list = new LinkedList<>();
        while(true){
            System.out.println("1. Kutubxonaga kitob qo‘shish\n" +
                    "2. Kutubxonadagi barcha kitoblarni ko‘rish\n" +
                    "3. Kitobni o‘chirish (nomi bo‘yicha)\n" +
                    "4. Kitobni qidirish (muallif bo‘yicha)\n" +
                    "5. Eng eski kitobni ko‘rsatish\n" +
                    "6. Kitob olish (nomi bo‘yicha → olinganmi = true)\n" +
                    "7. Dasturdan chiqish");
            System.out.print("Javobingiz?-> ");
            int tanlov = scanner.nextInt();
            if(tanlov==1){
                Kitob_Qoshish(list);
            }
            else if(tanlov==2){
                Barcha_Kitoblar(list);
            }
            else if(tanlov==3){
                Kitob_Ochirish(list);
            }
            else if(tanlov==4){
                Kitob_Qidirish(list);
            }
            else if(tanlov==5){
                Eski_Kitoblar(list);
            } else if(tanlov==6){
                Kitob_Olish(list);
            }
            else if(tanlov==7){
                break;
            }
            else {
                System.out.println("Bunday Hizmat Mavjud Emas!");
            }
        }
    }
    public void Kitob_Qoshish(LinkedList<Kitob> list){
        System.out.print("Kitob Nomi -> ");
        String nom = scanner.next();
        System.out.print("Kitob Mualifi -> ");
        String mualif = scanner.next();
        System.out.print("Kitob Ishlab Chiqarilgan Yili -> ");
        int yil = scanner.nextInt();
        System.out.print("Kitob Mavjudmi ha:(true) yoq(false) -> ");
        boolean olinganmi = scanner.hasNextBoolean();
        Kitob kitob = new Kitob(nom,mualif,olinganmi,yil);
        list.addLast(kitob);
    }
    public void Barcha_Kitoblar(LinkedList<Kitob> list){
        for(Kitob s:list){
            System.out.println(s.getNomi()+"-"+s.getMualif()+"-"+s.getYil()+"-"+s.isOlinganmi());
        }
    }
    public void Kitob_Ochirish(LinkedList<Kitob> list){
        System.out.print("O'chirmoqchi bo'lgan kitob nomini kiriting -> ");
        String nom = scanner.next();boolean top = true;
        for(int i=0;i<list.size();i++){
            if(list.get(i).getNomi().equalsIgnoreCase(nom)){
                list.remove(i);
                top = false;
                System.out.println("Kitob Malumotlari O'chirildi!");
            }
        }
        if(top) System.out.println("Bunday kitob Mavjud Emas!");
    }
    public void Kitob_Qidirish(LinkedList<Kitob> list){
        System.out.print("Qidirmoqchi Bo'lgan Kitob Mualifini Kiriting -> ");
        String mualif = scanner.next();
        boolean top = true;
        for(Kitob s:list){
            if(s.getMualif().equalsIgnoreCase(mualif)){
                System.out.println(s.getNomi()+"-"+s.getMualif()+"-"+s.getYil()+"-"+s.isOlinganmi());
                top = false;
            }
        }
        if(top){
            System.out.println("Bunday Mualif Kitobi Topilmdi!");
        }
    }
    public void Eski_Kitoblar(LinkedList<Kitob> list){
        for(Kitob s:list){
            if(s.getYil()<2001){
                System.out.println(s.getNomi()+"-"+s.getMualif()+"-"+s.getYil()+"-"+s.isOlinganmi());
            }
        }
    }
    public void Kitob_Olish(LinkedList<Kitob> list){
        System.out.println("Olishingiz Mumkin bolgan Kitoblar Royhati!");
        for(Kitob s:list){
            if (s.isOlinganmi()){
                System.out.println(s.getNomi()+"-"+s.getMualif()+"-"+s.getYil()+"-"+s.isOlinganmi());
            }
        }
        System.out.print("Olmoqchi bolgan Kirob Nomini Kiriting -> ");
        String nom = scanner.next();
        for(Kitob s:list){
            if(s.getNomi().equalsIgnoreCase(nom)){
                System.out.println("Kitob Olindi!");
                s.setOlinganmi(false);
            }
        }
    }
}