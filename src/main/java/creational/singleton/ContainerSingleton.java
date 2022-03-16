package creational.singleton;


import cn.hutool.core.util.StrUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author : wanghongtao
 * @Date : 2022/3/11
 * @Description :
 */
public class ContainerSingleton {

    private static Map<String,Object> singletonMap = new HashMap<>();

    public static void putInstance(String key, Object instance) {
        if (StrUtil.isNotBlank(key) && instance != null) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key,instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }

}
