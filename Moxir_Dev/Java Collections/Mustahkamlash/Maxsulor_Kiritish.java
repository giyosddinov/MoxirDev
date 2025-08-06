package Mustahkamlash;

import java.util.ArrayList;
import java.util.Scanner;
public class Maxsulor_Kiritish {
    Scanner scanner = new Scanner(System.in);
    public void Kirit(ArrayList<Maxsulotlar> maxsulotlar){
        for(int i=0;i<maxsulotlar.size();i++){
            System.out.print((i+1)+"-Maxsulot Nomi -> ");
            String nomi = scanner.next();
            System.out.print((i+1)+"-Maxsulot Miqdori -> ");
            int miqdor = scanner.nextInt();
            System.out.print((i+1)+"-Maxsulot Narxi -> ");
            double narx = scanner.nextDouble();
            Maxsulotlar maxsulot = new Maxsulotlar(nomi,miqdor,narx);
            maxsulotlar.add(maxsulot);
        }
    }
    public void Barcha_Maxsulotlar(ArrayList<Maxsulotlar> maxsulotlar){
        for (Maxsulotlar s:maxsulotlar){
            System.out.println(s.getNomi()+"-"+s.getNarx()+"-"+s.getMiqdor()+"dona");
        }
    }
    public void Narx_Bilish(ArrayList<Maxsulotlar> maxsulotlar){
        System.out.print("Qaysi Maxsulot Narxini Bilmoqchimisiz ?-> ");
        String s = scanner.next();
        boolean tekshir = false;
        for(int i=0;i<maxsulotlar.size();i++){
            if(maxsulotlar.get(i).getNomi()==s){
                tekshir = true;
                System.out.println(s+"-umumiy narxi : "+(maxsulotlar.get(i).getNarx()*maxsulotlar.get(i).getMiqdor()));
            }
            if (!tekshir){
                System.out.println("Bunday maxsulot topilmadi!");
            }
        }
    }
    public void Umumiy_Qiymat(ArrayList<Maxsulotlar> maxsulotlar){
        int umumiy = 0;
        for (int i=0;i<maxsulotlar.size();i++){
            umumiy+=maxsulotlar.get(i).getNarx()*maxsulotlar.get(i).getMiqdor();
        }
        System.out.println("Umumiy Qiymat -> "+umumiy);
    }
    public void Eng_Qimmat_Maxsulot(ArrayList<Maxsulotlar> maxsulotlar){
        Maxsulotlar m = new Maxsulotlar("test",0,0);
        for(int i=0;i<maxsulotlar.size();i++){
            if(m.getNarx()>maxsulotlar.get(i).getNarx()){
                m = maxsulotlar.get(i);
            }
        }
        System.out.println("Eng Qimmat Maxsulot -> "+m.getNomi()+"-"+m.getNarx());
    }
    public void Maxsulot_Ochirish(ArrayList<Maxsulotlar> maxsulotlars){
        String maxsulot;
        System.out.print("O'chirmoqchi Bo'lgan Maxsulot Nomini Kiriting -> ");
        maxsulot = scanner.next();
        boolean tekshir=true;
        for(int i=0;i<maxsulotlars.size();i++){
            if (maxsulotlars.get(i).getNomi().equalsIgnoreCase(maxsulot)){
                maxsulotlars.remove(i);
                tekshir = false;
                break;
            }
        }
        if(!tekshir) System.out.println("Bunday Maxsulot Topilmadi!");
    }
}