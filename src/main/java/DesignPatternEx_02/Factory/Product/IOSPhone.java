package DesignPatternEx_02.Factory.Product;

public class IOSPhone implements IProduct {
    @Override
    public void call() {
        System.out.println("This is IOSPhone");
    }
}
