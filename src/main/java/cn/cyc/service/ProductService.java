package cn.cyc.service;

import cn.cyc.model.Product;

import java.util.List;

/**
 * @author cyc
 */
public interface ProductService {

    /**
     * 获取 所有预约信息
     * @return
     */
    List<Product> getAllProduct();

    /**
     * 获取 正在进行中的预约信息
     * @return
     */
    List<Product> getActiveProduct();

    /**
     * 完成 预约
     * @param productId
     * @param serviceId
     * @return
     */
    boolean achievedProduct(int productId, int serviceId);

    /**
     * 添加 预约
     * @param product
     * @return
     */
    Product addProduct(Product product);

    /**
     * 返回 预约信息
     * @param productId
     * @return
     */
    Product getProduct(int productId);

    /**
     * 删除 预约
     * @param productId
     * @return
     */
    boolean deleteProduct(int productId);
}
