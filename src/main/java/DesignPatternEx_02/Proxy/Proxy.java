package DesignPatternEx_02.Proxy;

public class Proxy implements ISubject {
    @Override
    public void action() {
        realSubject.action();
    }

    RealSubject realSubject = null;

    protected Proxy(RealSubject subject) {
        this.realSubject = subject;
    }
}
