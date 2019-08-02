//package LeetCode.toLowerCase;
package toLowerCase;

import javax.print.DocFlavor;

public class ToLowerCaseDemo {
    public static void main(String[] args) {
        ToLowerCaseDemo demo = new ToLowerCaseDemo();
        //String result =demo.toLowerCase("LOVELY");
        //System.out.println("=> LowerCase : "+result);

        //int diff = 'A' - 'a';
        //System.out.println("A to a diff => " + diff);

        //打印所有字符的ASCII值
        //String character = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //for (Integer i = 0, len = character.length(); i < len; i++) {
        //    char c = character.charAt(i);
        //    System.out.println("char " + c + " ASCII => " + (int) c);
        //}

        String result = demo.toLowerCase2("Hello LOVELY");
        System.out.println("=> " + result);
    }

    /**
     * 第一种方法 使用内置函数
     * @param str
     * @return
     */
    public String toLowerCase(String str) {
        if (str.isEmpty()) return "";
        String str1 = str.toLowerCase();
        return str1;
    }

    /**
     * 第二种方法 通过ASCII差值进行大小写转换
     * @param str
     * @return
     */
    public String toLowerCase2(String str) {
        if (str.isEmpty()) return "";
        int diff = 'A' - 'a';
        StringBuilder sb = new StringBuilder();
        for (Integer i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                sb.append((char) (c - diff));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
