
import java.util.LinkedList;

public class Plus_One {
    public int[] plusOne(int[] digits) {
        LinkedList<Integer> list = new LinkedList<>();
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            list.addFirst(sum % 10);
            carry = sum / 10;
        }
        if (carry > 0) {
            list.addFirst(carry);
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        Plus_One plusOne = new Plus_One();
        int[] arr = {1,2,3,4,5,6};
        int[] son = plusOne.plusOne(arr);
        System.out.println(plusOne.plusOne(son));
    }
}
