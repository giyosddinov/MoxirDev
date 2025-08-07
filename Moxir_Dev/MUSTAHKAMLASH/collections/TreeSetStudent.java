package Mustahkamlash;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetStudent implements Comparable<TreeSetStudent> {
    public TreeSetStudent() {
    }

    private String ism;
    private int bal;
    public TreeSetStudent(String ism, int bal) {
        this.ism = ism;
        this.bal = bal;
    }

    public String getIsm() {
        return ism;
    }

    public void setIsm(String ism) {
        this.ism = ism;
    }

    public int getBal() {
        return bal;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }
    @Override
    public int compareTo(TreeSetStudent o) {
        return Integer.compare(this.bal, o.bal); // bal bo‘yicha tartiblash
    }

    @Override
    public String toString() {
        return "Ism: " + ism + ", Ball: " + bal;
    }
    public void kirit(int n){
        TreeSet<TreeSetStudent> set = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print(i+1+"-talaba ismi -> ");
            String ism = scanner.nextLine();
            System.out.print(i+1+"-talaba ozlashtirgan ball-> ");
            int bal = scanner.nextInt();
            TreeSetStudent student = new TreeSetStudent(ism,bal);
            set.add(student);
        }
        //set.comparator();
        System.out.print("Saralangan barcha Talabalar -> ");
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        System.out.println(set.descendingSet());
    }


    public static void main(String[] args) {
        int n =2;
        TreeSetStudent treeSetStudent = new TreeSetStudent();
        treeSetStudent.kirit(n);
    }
}
