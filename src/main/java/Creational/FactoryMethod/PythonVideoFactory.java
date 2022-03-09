package Creational.FactoryMethod;

/**
 * @Author : wanghongtao
 * @Date : 2022/3/9
 * @Description :
 */
public class PythonVideoFactory extends VideoFactory{

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
