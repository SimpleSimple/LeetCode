package StringDemo;

import javax.xml.bind.SchemaOutputResolver;

public class StringDemo {
    public static void main(String[] args) {
        //  java字符串是值不可变的语言
        String s1 = "hello";
        String s2 = "hello";
        System.out.println("s1 == s2：" + (s1 == s2));

        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("hello");

        System.out.println("sb1 == sb2：" + (sb1 == sb2));

        System.out.println("1010 >> 4：" + (1010 >> 4));
        System.out.println("1011 >> 4：" + (1011 >> 4));

        /*
        * result = 2
        * 总结：>>位移运算符相当整除2，比如5整除2余2，模为1
        * */
        System.out.println("5 >> 1：" + (5 >> 1));
    }
}
