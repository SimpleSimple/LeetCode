package DesignPatternEx_02.Proxy;

public class RealSubject implements ISubject {
    @Override
    public void action() {
        System.out.println("这是被代理的真实目标对象");
    }

}
