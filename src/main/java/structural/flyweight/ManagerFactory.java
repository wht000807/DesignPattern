package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author : wanghongtao
 * @Date : 2022/3/16
 * @Description :
 */
public class ManagerFactory {

    public static final Map<String,Manager> MANAGER_MAP= new HashMap<>();


    public static Manager getManager(String department) {
        if (MANAGER_MAP.get(department) == null) {
            System.out.println("正在创建部门经理:"+department);
            Manager manager = new Manager(department);
            manager.setTitle("。。。");
            MANAGER_MAP.put(department,manager);
        }
        return MANAGER_MAP.get(department);
    }
}
