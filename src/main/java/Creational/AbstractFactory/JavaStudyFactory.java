package Creational.AbstractFactory;

/**
 * @Author : wanghongtao
 * @Date : 2022/3/9
 * @Description :
 */
public class JavaStudyFactory extends StudyFactory{
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
