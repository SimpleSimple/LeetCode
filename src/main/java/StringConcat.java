public class StringConcat {
    public static void main(String[] args) {
        String myStr = "aa" + "bb" + "cc" + "dd";
        System.out.println("My String:" + myStr);
        String var2 = "aabbccdd";
        System.out.println(myStr == var2);

        //一个Char等于两个byte
        char var1 = 'a';

        Byte[] bytes = new Byte[2];
        System.out.println("char length:");
        System.out.println("bytes length:" + bytes.length);
    }
}
