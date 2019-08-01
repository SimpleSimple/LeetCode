/*
 * 65. Valid Number
 * Validate if a given string can be interpreted as a decimal number.
 * Some examples:
 *   "0" => true
 *   " 0.1 " => true
 *   "abc" => false
 *   "1 a" => false
 *   "2e10" => true
 *   " -90e3   " => true
 *   " 1e" => false
 *   "e3" => false
 *   " 6e-1" => true
 *   " 99e2.5 " => false
 *   "53.5e93" => true
 *   " --6 " => false
 *   "-+3" => false
 *   "95a54e53" => false
 *
 *  eE - 表示自然底数
 *  自然底数前必须要有数字，否则不是一个数字直接返回false
 *
 * */

public class ValidNumberDemo {
    public static void main(String[] args) {
        String[] cases = {
                "2e10",
                " -90e3   ",
                " 1e",
                "e3",
                " 6e-1",
                " 99e2.5 ",
                "53.5e93"
        };

        ValidNumberDemo demo = new ValidNumberDemo();
        for (int i = 0; i < cases.length; i++) {
            boolean flag = demo.IsNumber(cases[i]);
            System.out.println(cases[i] + " " + flag);
        }
    }

    public boolean IsNumber(String s) {
        s = s.trim();
        boolean seeE = false;
        boolean seeNumberAfterE = false;
        boolean seeNumberBeforeE = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                if (seeE) {
                    seeNumberAfterE = true;
                } else {
                    seeNumberBeforeE = true;
                }
            } else if (c == 'e') {
                if (seeE) {
                    return false;
                }
                seeE = true;
            } else {
                return false;
            }
        }
        return seeNumberBeforeE && !seeE || seeNumberBeforeE && seeNumberAfterE;
    }
}
