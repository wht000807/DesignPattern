package structural.flyweight;

/**
 * @Author : wanghongtao
 * @Date : 2022/3/16
 * @Description :
 */
public class Test {

    private static final String[] departments = new String[]{"RD","BD","PM"};

    public static void main(String[] args) {
        for (int i = 0 ; i < 10; i++) {
            String department = departments[(int)(Math.random()*departments.length)];
            Manager manager = ManagerFactory.getManager(department);
            manager.report();
        }
    }

}
