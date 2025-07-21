import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("1-masala");
        masala1();
        System.out.println("2-masala");
        masala2();
        System.out.println("3-masala");
        masala3();
        System.out.println("4-masala");
        masala4();
        System.out.println("5-masala");
        masala5();
        System.out.println("6-masala");
        masala6();
        System.out.println("7-masala");
        masala7();
        System.out.println("8-masala");
        masala8();
        System.out.println("9-masala");
        masala9();
        System.out.println("10-masala");
        masala10();
    }
    public static void masala1(){
        Scanner scanner  = new Scanner(System.in);
        System.out.print("nechta element yozasiz >>> ");
        int n = scanner.nextInt();
        int[] arr = new  int[n];
        for(int i=0;i<n;i++){
            System.out.print(i+1+"-elementni kiriting >>> ");
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[n-2]);
    }
    public static void masala7(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("parolni kiriting >>> ");
        String parol = scanner.nextLine();
        char[] parol1 = parol.toCharArray();
        int belgi=0,soz_kichik=0,soz_katta=0,son=0;
        for(int i=0;i< parol1.length;i++){
            int a = (int)parol1[i];
            if(a>=48&&a<=57) son+=1;
            else if (a>=65&&a<=90) soz_katta+=1;
            else if (a>=97&&a<=122) soz_kichik+=1;
            else belgi+=1;
        }
        if(belgi>=1&&soz_kichik>0&&soz_katta>0&&son>0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    public static void masala2(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Massiv elementlar sonini kirting >> ");
        int n=scanner.nextInt(),sum=0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print(i+1+"-elementni kirting >>> ");
            arr[i] = scanner.nextInt();
            sum+=arr[i];
        }
        System.out.println("Natija: "+sum);
    }
    public static void masala3(){
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Massiv elementlar sonini kiriting >>> ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print(i+1+"-elementni kirting >> ");
            arr[i] = scanner.nextInt();
        }
        boolean a = true;
        for(int i =0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                a= false;
                break;
            }
        }
        if(a) System.out.println("true");
        else System.out.println("false");
    }
    public static void masala4(){
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Massiv elementlar sonini kiriting >>> ");
        int n= scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print(i+1+"-elementni kiriting >> ");
            arr[i] = scanner.nextInt();
        }
        int sana=0;
        String a="";
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(arr[i]==arr[j]) sana+=1;
            }
            sana=0;
        }
        System.out.println(a);
    }
    public static void masala5(){
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Massiv elementlar sonini kiriting >>> ");
        int n= scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print(i+1+"-elementni kiriting >> ");
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int max=arr[n-1],min=arr[0];
        System.out.println("("+min+","+max+")");
    }
    public static void masala8(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Farangeyt ni kiriting >>> ");
        int Farangeyt = scanner.nextInt();
        int Selsiy = (Farangeyt - 32) * 5/9;
        System.out.println("Farangeyt: "+Farangeyt+"\tSelsiy: "+Selsiy);
    }
    public static void masala9(){
        System.out.print("Uzunlik = ");
        Scanner scanner = new Scanner(System.in);
        int uzunlik = scanner.nextInt();
        System.out.print("Kenglik = ");
        int kenglik = scanner.nextInt();
        System.out.println("Maydon = "+uzunlik*kenglik);
    }
    public static void masala10(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tug‘ilgan yilni kiriting: ");
        int tYil = scanner.nextInt();
        System.out.print("Tug‘ilgan oy (1-12): ");
        int tOy = scanner.nextInt();
        System.out.print("Tug‘ilgan kun (1-31): ");
        int tKun = scanner.nextInt();
        System.out.print("Hozirgi yilni kiriting: ");
        int hYil = scanner.nextInt();
        System.out.print("Hozirgi oy (1-12): ");
        int hOy = scanner.nextInt();
        System.out.print("Hozirgi kun (1-31): ");
        int hKun = scanner.nextInt();
        int tJamiKun = tYil * 360 + tOy * 30 + tKun;
        int hJamiKun = hYil * 360 + hOy * 30 + hKun;
        int farqKun = hJamiKun - tJamiKun;
        int yoshYil = farqKun / 360;
        int qolganKun = farqKun % 360;
        int yoshOy = qolganKun / 30;
        int yoshKun = qolganKun % 30;
        System.out.println("Sizning yoshingiz: " + yoshYil + " yil, " + yoshOy + " oy, " + yoshKun + " kun.");
    }


    public static void masala6(){
        boolean a = true;
        boolean b = false;
        boolean ikkalaTrue = a && b;
        System.out.println("Ikkalasi ham true: " + ikkalaTrue);
        boolean bittaTrue = a || b;
        System.out.println("Kamida bittasi true: " + bittaTrue);
    }
}