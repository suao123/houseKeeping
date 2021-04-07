package cn.cyc.utils;

import java.util.HashMap;

/**
 * @author cyc
 */
public class BaseUtils {

    private BaseUtils() {}

    public static HashMap<String, String> getResult(boolean flag) {
        HashMap<String, String> result = new HashMap<>();
        if (flag) {
            result.put("msg", "true");
        } else {
            result.put("msg", "false");
        }
        return result;
    }
}
