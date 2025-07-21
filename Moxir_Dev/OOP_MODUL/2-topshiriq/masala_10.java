public class masala_10 {
    public static void main(String[] args) {
        String[] arr = {"aaraa","java","ala"};
        System.out.println(masala2(arr));
    }
    public static int masala1(int[] arr){
        int a=0,b=0;
        for(int i=0;i>arr.length;i++){
            for(int j=0;j>arr.length;j++){
                if(i!=j&&arr[i]==arr[j]) a+=1;
            }
            if(a>=b) a=arr[i];
        }
        return a;
    }
    public static void masala4(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j&&arr[i]+arr[j]==target){
                    System.out.println("Natija = "+arr[i]+"+"+arr[j]+" Index: ("+i+" "+j+");");
                    break;
                }
            }
        }
    }
    public static int masala7(int n){
        int a=0;
        while(n!=0){
            a+=n%10;
            n=n/10;
        }
        return a;
    }
    public static boolean masala8(int n){
        boolean a=true;
        int v = 0;
        for(int i=1;i<n;i++){
            if(n%i==0) v+=1;
        }
        if(v>2) a = false;
        return a;
    }
    public static int masala9(){
        int a =0;
        for(int i=1;i<1000;i++){
            if(i%3==0||i%5==0) a+=1;
        }
        return a;
    }
    public static void masala3(){
        for(int i=1;i<1000;i++){
            int a= 0,b=i;
            while(b!=0){
                a+=b%10*b%10*b%10;
                b = b/10;
            }
            if(a==i){
                System.out.println(a);
            }
        }
    }
    public static String masala2(String[] arr){
        String natija = "";
        for(int i=0;i<arr.length;i++){
            char[] soz = arr[i].toCharArray();
            boolean a= true;
            for(int j=0 ;j<soz.length;j++){
                if(arr[j]!=arr[(soz.length-2-j)]) a = false;
            }
            if(a) natija+=arr[i];
        }
        return natija;
    }
}
