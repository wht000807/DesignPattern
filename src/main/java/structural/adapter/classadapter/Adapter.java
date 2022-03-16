package structural.adapter.classadapter;

/**
 * @Author : wanghongtao
 * @Date : 2022/3/14
 * @Description :
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
