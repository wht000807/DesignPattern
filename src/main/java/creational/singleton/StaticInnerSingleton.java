package creational.singleton;

/**
 * @Author : wanghongtao
 * @Date : 2022/3/9
 * @Description :
 */
public class StaticInnerSingleton {

    private static class StaticInner {
        private static StaticInnerSingleton staticInnerSingleton = new StaticInnerSingleton();
    }
    public static StaticInnerSingleton getInstance() {
        return StaticInner.staticInnerSingleton;
    }

    private StaticInnerSingleton(){}
}
