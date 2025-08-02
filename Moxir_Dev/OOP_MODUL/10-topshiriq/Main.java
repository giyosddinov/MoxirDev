public class Main{
    public static void main(String[] args) {
        MyTime mytime = new MyTime(23,59,59);
        mytime.setTime(mytime.getSoat(),mytime.getDaqiqa(),mytime.getSoniya());
        System.out.println(mytime.toString());
        mytime.nextSecond();
        System.out.println(mytime.toString());
        mytime.previousHours();mytime.previousMinut();mytime.previousSecond();
        System.out.println(mytime.toString());
    }
}