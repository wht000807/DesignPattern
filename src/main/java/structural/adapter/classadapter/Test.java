package structural.adapter.classadapter;

/**
 * @Author : wanghongtao
 * @Date : 2022/3/14
 * @Description :
 */
public class Test {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();

        Target target1 = new ConcreteTarget();
        target1.request();
    }
}
