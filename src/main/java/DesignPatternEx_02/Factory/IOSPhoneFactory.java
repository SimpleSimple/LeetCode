package DesignPatternEx_02.Factory;

import DesignPatternEx_02.Factory.Product.IOSPhone;
import DesignPatternEx_02.Factory.Product.IProduct;

public class IOSPhoneFactory extends AbstractFactory {
    @Override
    public IProduct createProduct() {
        return new IOSPhone();
    }
}
