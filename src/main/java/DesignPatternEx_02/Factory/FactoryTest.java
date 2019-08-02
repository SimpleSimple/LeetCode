package DesignPatternEx_02.Factory;

import DesignPatternEx_02.Factory.Product.IProduct;

public class FactoryTest {
    public static void main(String[] args) {
        //Creator factory = new TomatoEggsCreatorFactory();
        //Food tomatoEggs = factory.CreateFactory();
        //tomatoEggs.print();

        // 创建IPhone手机工厂，生产IPhone手机
        AbstractFactory factory = new IOSPhoneFactory();
        IProduct product = factory.createProduct();
        product.call();

        // 创建Android手机工厂，生产Android手机
        AbstractFactory factory1 = new AndroidPhoneFactory();
        product = factory1.createProduct();
        product.call();

        /**
         * 工厂模式的优缺点
         *  - 优点：
         *      - 不需要知道具体的实现子类
         *      - 更容易扩展对象的版本
         *  - 缺点：
         *      - 具体产品对象和工厂方法的耦合性高
         */
    }
}
