package creational.singleton;

/**
 * @Author : wanghongtao
 * @Date : 2022/3/9
 * @Description : 懒汉模式
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton(){}

    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }


}
