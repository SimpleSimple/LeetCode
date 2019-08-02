public class StringAndStringBufferDemo {
    public static void main(String[] args) {
        String s1 = "hello world";
        String s2 = new String("hello world");
        String s3 = "hello world";
        String s4 = new String("hello world");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s4);
    }
}
