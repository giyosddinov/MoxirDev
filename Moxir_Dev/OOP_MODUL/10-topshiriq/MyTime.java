public class MyTime{
    private int soat=0;
    private int daqiqa=0;
    private int soniya=0;
    private boolean tekshir = true;
    public MyTime() {}
    public MyTime(int soat, int daqiqa, int soniya) {
        this.soat = soat;
        this.daqiqa = daqiqa;
        this.soniya = soniya;
    }
    public void setSoat(int soat) {
        this.soat = soat;
    }
    public void setDaqiqa(int daqiqa) {
        this.daqiqa = daqiqa;
    }
    public void setSoniya(int soniya) {
        this.soniya = soniya;
    }
    public int getSoat() {
        return soat;
    }
    public int getDaqiqa() {
        return daqiqa;
    }
    public int getSoniya() {
        return soniya;
    }
    public void setTime(int soat,int daqiqa,int soniya){
        if(soat>23||soat<0){
            System.out.println("Yaroqsiz Soat!");
            tekshir = false;
        }
        if(daqiqa>59||daqiqa<0){
            System.out.println("Yaroqsiz Daqiqa!");
            tekshir = false;
        }
        if(soniya>59||soniya<0){
            tekshir = false;
        }
        if(tekshir){
            this.soat = soat;
            this.daqiqa = daqiqa;
            this.soniya = soniya;
        }
    }
    @Override
    public String toString(){
        String S="";
        if(tekshir) S+="'"+getSoat()+":"+getDaqiqa()+":"+getSoniya()+"'";
        else S+="Yroqsiz soat,daqiqa va soniya mavjud!";
        return S;
    }
    public void nextHours(){
        soat+=1;
        if(soat==24){
            soat = 0;
        }
    }
    public void nextMinut(){
        daqiqa+=1;
        if(daqiqa==60){
            daqiqa = 0;
            soat+=1;
            if(soat ==24){
                soat=0;
            }
        }
    }
    public void nextSecond(){
        soniya+=1;
        if(soniya==60){
            soniya=0;
            daqiqa+=1;
            if(daqiqa==60){
                daqiqa=0;
                soat+=1;
                if(soat==24){
                    soat=0;
                }
            }
        }
    }
    public void  previousHours(){
        soat-=1;
        if(soat==-1){
            soat=23;
        }
    }
    public void  previousMinut(){
        daqiqa-=1;
        if(daqiqa==-1){
            daqiqa = 59;
            soat-=1;
            if(soat==-1){
                soat = 23;
            }
        }
    }
    public void  previousSecond(){
        soniya-=1;
        if(soniya==-1){
            soniya = 59;
            daqiqa-=1;
            if(daqiqa==-1){
                daqiqa = 59;
                soat-=1;
                if(soat==-1){
                    soat=23;
                }
            }
        }
    }
}