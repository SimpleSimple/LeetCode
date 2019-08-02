package DataStructureEx;

/**
 * 练习一
 * 去除多个字符串中间多余的空格，只允许中间至多只有一个空格
 */
public class Demo_01 {
    public static void main(String[] args) {
        // 去除多余的空格
        String str = "aaa aaa  aaaa      aaaaa";
        String[] strArray = str.split("\\s+");
        String result = "";
        for (String temp : strArray) {
            result += temp + " ";
        }
        System.out.println(result);
    }
}
