package creational.abstractfactory;

/**
 * @Author : wanghongtao
 * @Date : 2022/3/9
 * @Description :
 */
public class PythonStudyFactory extends StudyFactory{
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
