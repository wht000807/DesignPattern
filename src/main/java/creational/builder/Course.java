package creational.builder;

/**
 * @Author : wanghongtao
 * @Date : 2022/3/1
 * @Description :
 */
public class Course {

    private String courseName;
    private String coursePPT;
    private String courseArticle;
    private String coursePic;

    public Course(CourseBuilder courseBuilder) {
        this.courseName = courseBuilder.courseName;
        this.coursePPT = courseBuilder.coursePPT;
        this.courseArticle = courseBuilder.courseArticle;
        this.coursePic = courseBuilder.coursePic;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", coursePic='" + coursePic + '\'' +
                '}';
    }

    public static class CourseBuilder{
        private String courseName;
        private String coursePPT;
        private String courseArticle;
        private String coursePic;

        public CourseBuilder() {
        }

        public CourseBuilder buildCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public CourseBuilder buildCoursePPT(String coursePPT) {
            this.coursePPT = coursePPT;
            return this;
        }

        public CourseBuilder buildCourseArticle(String courseArticle) {
            this.courseArticle = courseArticle;
            return this;
        }

        public CourseBuilder buildCoursePic(String coursePic) {
            this.coursePic = coursePic;
            return  this;
        }

        public Course build() {
            return new Course(this);
        }

    }

}
