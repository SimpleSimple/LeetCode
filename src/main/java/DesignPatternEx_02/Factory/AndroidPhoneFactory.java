package DesignPatternEx_02.Factory;

import DesignPatternEx_02.Factory.Product.AndroidPhone;
import DesignPatternEx_02.Factory.Product.IProduct;

/**
 * AbstractFactory - 这里抽象工厂不是抽象工厂模式，是工厂模式，名字可能需要重新调整
 */
public class AndroidPhoneFactory extends AbstractFactory {
    @Override
    public IProduct createProduct() {
        return new AndroidPhone();
    }
}
