package DesignPatternEx_02.Factory;

import DesignPatternEx_02.Factory.Product.IProduct;

public abstract class AbstractFactory {
    // 创建产品的方法
    public abstract IProduct createProduct();
}
