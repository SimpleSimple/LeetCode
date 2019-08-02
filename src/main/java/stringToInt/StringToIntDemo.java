package stringToInt;

public class StringToIntDemo {
    public static void main(String[] args) {
        String s = "abcdfadsfaf";
//        int val = Integer.parseInt(s);
//        System.out.println(val);

        int val2 = Integer.valueOf(s).intValue();
        System.out.println(val2);
    }

    public int myAtoi(String str) {
        str = str.trim();

        int start = 0;
        int len = str.length();
        int sign = 1,
            num = 0;
        for (int i = start; i < len; i++) {
            //sum = sum * 10 + str.charAt(i) - "0";
        }

        return 0;
    }
}
