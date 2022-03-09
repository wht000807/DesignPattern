package creational.singleton;

/**
 * @Author : wanghongtao
 * @Date : 2022/3/9
 * @Description : 线程测试类
 */
public class ThreadT implements Runnable{

    @Override
    public void run() {
//      LazySingleton lazySingleton = LazySingleton.getInstance();
//        LazyDoubleCheckSingleton lazySingleton = LazyDoubleCheckSingleton.getInstance();
        StaticInnerSingleton lazySingleton = StaticInnerSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + lazySingleton);
    }

}
