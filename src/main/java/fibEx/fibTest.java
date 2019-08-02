package fibEx;

public class fibTest {
    public static void main(String[] args) {
        fibTest test = new fibTest();
        int result = test.fib(4);
        System.out.println(result);
    }

    // 裴波那契数
    // n<2      F(0)=0
    //          F(1)=1
    // n>=2     F(n) = F(n-1)+F(n-2)
    public int fib(int n) {
        int result;
        if (n < 2) {
            result = n;
        } else {
            result = fib(n - 1) + fib(n - 2);
        }
        return result;
    }
}
