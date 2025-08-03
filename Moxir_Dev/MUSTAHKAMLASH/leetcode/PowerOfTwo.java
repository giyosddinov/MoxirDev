public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        boolean a = false;
        for(int i=0;i<n;i++){
            if(Math.pow(2,i)==n){
                a = true;
                break;
            }
            else if(Math.pow(2,i)>n){
                a = false;
                break;
            }
        }
        return a;
    }
}
