package structural.adapter.objectadapter;


/**
 * @Author : wanghongtao
 * @Date : 2022/3/14
 * @Description :
 */
public class Adapter  implements Target {
    Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
