package creational.singleton;

/**
 * @Author : wanghongtao
 * @Date : 2022/3/11
 * @Description :
 */
public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> threadLocal =
            new ThreadLocal<ThreadLocalInstance>(){
                @Override
                protected ThreadLocalInstance initialValue() {
                    return new ThreadLocalInstance();
                }
            };


    private ThreadLocalInstance() {
    }

    public static ThreadLocalInstance getInstance() {
        return threadLocal.get();
    }
}
