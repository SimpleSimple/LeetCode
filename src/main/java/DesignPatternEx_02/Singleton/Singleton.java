package DesignPatternEx_02.Singleton;

public class Singleton {
    private static Singleton instance;  // 定义一个静态的唯一私有实例对象

    private Singleton() {   // 私有化构造函数
        System.out.println("获取实例对象hashCode：" + this.hashCode() + " 十六进制的hashCode：" + Integer.toHexString(hashCode()));
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton(); // 实例化对象
                }
            }
        }
        return instance;    // 返回实例化对象
    }
    /**
     * 总结：
     *     - 单例模式需要声明一个自身类型的私有静态类实例
     *     - 单例模式必须使用私有构造函数
     */
}
