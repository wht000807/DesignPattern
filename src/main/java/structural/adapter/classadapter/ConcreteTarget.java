package structural.adapter.classadapter;

/**
 * @Author : wanghongtao
 * @Date : 2022/3/14
 * @Description :
 */
public class ConcreteTarget implements Target{
    @Override
    public void request() {
        System.out.println("Target目标方法");
    }
}
