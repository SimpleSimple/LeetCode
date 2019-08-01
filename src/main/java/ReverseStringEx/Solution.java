package ReverseStringEx;

public class Solution {
    public static void main(String[] args) {
        String teststr = "\"I had another bad dream,\" she told her fiancé. \"It was about you again. You and your ex-girlfriend were kissing. I yelled at you to stop it. You looked right at me, and then you laughed at me! She laughed, too. Then you both went back to kissing. I tried not to watch, but when I covered my eyes, something pulled my hands away. I tried to leave, but my feet were glued to the ground. Finally, I woke up. Of course, it was very difficult to get back to sleep.";
        char[] charArray = teststr.toCharArray();
        //System.out.print(teststr);
        //String str2 = reverseString(charArray);
        System.out.print(reverseString(charArray));
    }

    static String reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        char temp = '0';
        while (i < j) {
            temp = s[j];
            s[j] = s[i];
            s[i] = temp;

            i++;
            j--;
        }
        return new String(s);
    }

}
