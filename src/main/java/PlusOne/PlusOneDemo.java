package PlusOne;

public class PlusOneDemo {
    public static void main(String[] args) {
        PlusOneDemo demo =new PlusOneDemo();

        int[] num = {4, 3, 2, 1};
        int[] arr = demo.plusOne(num);
        for (int val : arr) {
            System.out.println(val);
        }

    }

    public int[] plusOne(int[] digits) {
        /**
         *  从后往前看这个数组
         *  如果为正常数组，把最后一个不为9的数+1就好
         */
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] < 9) {   // 如果最后一位数组为正常不为9的数，把该位的数+1就行
                digits[i] = digits[i] + 1;
                return digits;
            }
            digits[i] = 0;
        }
        return digits;
    }
}
