public class CharInStringTest {
    public static void main(String[] args) {
        // 了解charAt
        // 字符串要取其中的某一个字符的时候不能使用数组的方式，比如 s[i]
        // 要使用chatAt方法才可以
        String s = "adasdasds";
        for (int i = 0; i < s.length(); i++) {
            System.out.println("position " + i + " is " + s.charAt(i));
        }
    }
}
