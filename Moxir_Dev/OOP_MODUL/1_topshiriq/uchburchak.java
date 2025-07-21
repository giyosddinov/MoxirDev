public class uchburchak {
    public void umumiy(int a,int b,int c){
        boolean v =false;
        if((a+b)>c&&(a+c)>b&&(c+b)>a) v = true;
        if(v){
            System.out.println("bunday uchburchak mavjud!");
            System.out.println("birinchi tomon -> "+a);
            System.out.println("ikkinchi tomon -> "+b);
            System.out.println("uchinchi tomon -> "+c);
            System.out.println("peremetr -> "+(a+b+c));
            System.out.println("yuza ->"+((a+b)/2));
        }
        else System.out.println("bunday uchburchak mavjud emas");
    }
}
