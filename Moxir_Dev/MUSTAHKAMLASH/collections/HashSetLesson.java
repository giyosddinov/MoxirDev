package Mustahkamlash;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetLesson {
    public static void func(String chat){
//        HashSet<String> set = new HashSet<>();
//        String[] arr = matn.split(" ");
//        for(int i=0;i<arr.length;i++){
//            set.add(arr[i]);
//        }
//        HashSet<String> set1 = new HashSet<>();
//        int sana=0;
//        for(String s:set){
//            for(int i=0;i<arr.length;i++){
//                if(s==arr[i]){
//                    sana+=1;
//                }
//            }
//            if(sana>1){
//                sana=0;
//                set1.add(s);
//            }
//        }
//        set.clear();
//        return set1;
        String[] chat_sozlar = chat.split(" ");
        HashSet<String> noyob_sozlar = new HashSet<>();
        for(int i=0;i<chat_sozlar.length;i++){
            noyob_sozlar.add(chat_sozlar[i]);
        }
        System.out.println("1)Barcha Noyob So'zlar -> "+noyob_sozlar);
        for(String s:noyob_sozlar){
            
        }
    }

    public static void main(String[] args) {
        Scanner scaner= new Scanner(System.in);
        System.out.print("Matini Kiriting -> ");
        String matn = scaner.nextLine();
    }
}
