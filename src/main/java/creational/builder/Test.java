package creational.builder;

/**
 * @Author : wanghongtao
 * @Date : 2022/3/1
 * @Description :
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("Java课程").buildCourseArticle("Java文章").build();
        System.out.println(course);
    }
}
