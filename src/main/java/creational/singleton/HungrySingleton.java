package creational.singleton;

/**
 * @Author : wanghongtao
 * @Date : 2022/3/9
 * @Description :
 */
public class HungrySingleton {
    private final static HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    public static HungrySingleton getInstance(){
        return HUNGRY_SINGLETON;
    }
}
