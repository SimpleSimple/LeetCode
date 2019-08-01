package DesignPatternEx_02.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();

        Proxy proxy = new Proxy(realSubject);
        proxy.action();
    }
}
