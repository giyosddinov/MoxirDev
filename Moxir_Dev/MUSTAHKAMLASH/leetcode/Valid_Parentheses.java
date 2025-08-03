public class Valid_Parentheses {
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        boolean tekshir = false;
        for(int i=0;i<arr.length-1;i++){
            if (arr[i]=='('&&arr[i+1]==')'){
                tekshir=true;
            }
            else if(arr[i]=='{'&&arr[i+1]=='}'){
                tekshir = true;
            }
            else if(arr[i]=='['&&arr[i+1]==']'){
                tekshir = true;
            }
            else {
                tekshir = false;
                break;
            }
        }
        return tekshir;
    }

    public static void main(String[] args) {
        Valid_Parentheses validParentheses = new Valid_Parentheses();
        String S = "(){}[]";
        System.out.println(validParentheses.isValid(S));
    }
}
