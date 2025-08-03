public class ValidPalindrome {
    class Solution {
        public boolean isPalindrome(String s) {
            if(s.isEmpty()){
                return true;
            }
            s= s.toLowerCase();
            String umumiysoz = "";
            for(int i=0;i<s.length();i++){
                char harf = s.charAt(i);
                if((int)harf != 32){
                    umumiysoz+=harf;
                }
            }
            int uzunlik = umumiysoz.length();
            for (int i = 0; i < uzunlik / 2; i++) {
                if (umumiysoz.charAt(i) != umumiysoz.charAt(uzunlik - 1 - i)) {
                    return false;
                }
            }
            return true;
        }
    }
}
