package creational.factorymethod;

/**
 * @Author : wanghongtao
 * @Date : 2022/3/9
 * @Description :
 */
public class Test {
    public static void main(String[] args) {
        Video video = new JavaVideoFactory().getVideo();
        video.play();
    }
}
