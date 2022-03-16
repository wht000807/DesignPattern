package structural.flyweight;

/**
 * @Author : wanghongtao
 * @Date : 2022/3/16
 * @Description :
 */
public class Manager implements Employee{

    public String department;

    public String title;

    public Manager(String department) {
        this.department = department;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void report() {
        System.out.println(department+"正在演讲"+title);
    }
}
