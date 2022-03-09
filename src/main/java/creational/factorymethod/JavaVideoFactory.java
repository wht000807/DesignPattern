package creational.factorymethod;

/**
 * @Author : wanghongtao
 * @Date : 2022/3/9
 * @Description :
 */
public class JavaVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
