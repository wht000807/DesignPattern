package creational.easyfactory;

/**
 * @Author : wanghongtao
 * @Date : 2022/3/1
 * @Description :
 */
public class Test {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        CourseFactory courseFactory = new CourseFactory();
        courseFactory.makeCourse(JavaCourse.class);
    }

}
