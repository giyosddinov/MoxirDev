package Mustahkamlash;
import java.util.ArrayList;
public class nimadir  {
    public double ortabaxo=0;
    public void ortacha_baxo(ArrayList<Student> students){
        double umum = 0;
        for(int i=0;i<students.size();i++){
            umum+=students.get(i).getBaxo();
        }
        ortabaxo =  umum/students.size();
        System.out.println("O'ratcha baxo -> "+ortabaxo);
    }
    public void alochi_student(ArrayList<Student> students){
        System.out.println("O'rtachadan yuqori ball toplagan talabalar!");
        for(int i=0;i<students.size();i++){
            if(students.get(i).getBaxo()>ortabaxo){
                System.out.println(students.get(i).getIsm()+"-"+students.get(i).getBaxo());
            }
        }
    }
    public void Barcha_Talaba(ArrayList<Student> students){
        for(int i=0;i<students.size();i++){
            System.out.println(students.get(i).getIsm()+"-"+students.get(i).getBaxo());
        }
    }
    public void saralash(ArrayList<Student> students){
        for(int i=0;i<students.size()-1;i++){
            boolean swaped = false;
            for(int j=0;j<students.size()-1-i;j++){
                if(students.get(j).getBaxo()>students.get(j+1).getBaxo()){
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                    swaped  =true;
                }
            }
            if(!swaped){
                break;
            }
        }
    }
    public void engYuqriTalaba(ArrayList<Student> list){
        System.out.println(list.getFirst());
    }
}
