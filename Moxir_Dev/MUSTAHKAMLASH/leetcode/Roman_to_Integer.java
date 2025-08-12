public class Roman_to_Integer {
    public int romanToInt(String s) {
        char[] arr = s.toCharArray();
        int yegindi = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='I'){
                yegindi+=1;
            }
            else if(arr[i]=='V'){
                yegindi+=5;
            }
            else if(arr[i]=='X'){
                yegindi+=10;
            }
            else if(arr[i]=='L'){
                yegindi+=50;
            }
            else if(arr[i]=='C'){
                yegindi+=100;
            }
            else if(arr[i]=='D'){
                yegindi+=100;
            }
            else if(arr[i]=='M'){
                yegindi+=1000;
            }
        }
        return yegindi;
    }
}
