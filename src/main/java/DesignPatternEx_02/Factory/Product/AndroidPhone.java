package DesignPatternEx_02.Factory.Product;

public class AndroidPhone implements IProduct {
    @Override
    public void call() {
        System.out.println("This is AndroidPhone");
    }
}
