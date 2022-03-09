package Creational.EasyFactory;

/**
 * @Author : wanghongtao
 * @Date : 2022/3/1
 * @Description :
 */
public class CourseFactory {

    private Course course;

    public void makeCourse(Class clazz) throws InstantiationException, IllegalAccessException {
//        if ("java".equals(name)) {
//            course = new JavaCourse();
//            course.process();
//        }
//        if ("python".equals(name)) {
//            course = new PythonCourse();
//            course.process();
//        }

        course = (Course) clazz.newInstance();
        course.process();


    }

}
