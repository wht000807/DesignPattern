package creational.singleton;

/**
 * @Author : wanghongtao
 * @Date : 2022/3/11
 * @Description :
 */
public enum EnmuInstance {

    /**
     * 实例对象
     */
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object o) {
        data = o;
    }

    public static  Object getInstance() {
        return INSTANCE;
    }


}
