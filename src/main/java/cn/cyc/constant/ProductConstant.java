package cn.cyc.constant;

/**
 * @author  cyc
 */
public class ProductConstant {

    private ProductConstant() {
        // 私有函数，是其变为工具类，不能访问
    }

    public final static int UNFINISHED = 0;
    public final static int FINISHED = 1;

    public final static boolean ACTIVE = false;
    public final static boolean DELETED = true;
}
