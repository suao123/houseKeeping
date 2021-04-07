package cn.cyc.controller;

import cn.cyc.model.Product;
import cn.cyc.service.ProductService;
import cn.cyc.utils.BaseUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@RequestMapping("/products")
@RestController
public class ProductApi {

    @Resource
    ProductService productService;

    /**
     * 获取所有用户信息
     * @return
     */
    @GetMapping("")
    public List<Product> getAll() {
        return productService.getAllProduct();
    }

    /**
     * 获取 正在进行的预约列表
     * @return
     */
    @GetMapping("/active")
    public List<Product> getActiveProduct() {
        return productService.getActiveProduct();
    }

    @PostMapping("/{productId}/achieved/{servicedId}")
    public HashMap<String, String> achievedProduct(@PathVariable("productId") int productId,
                                                   @PathVariable("servicedId") int servicedId) {
        return BaseUtils.getResult(productService.achievedProduct(productId, servicedId));
    }

    /**
     *  添加预约
     * @param product
     * @return
     */
    @PostMapping("")
    public Product addProduct(@ModelAttribute Product product) {
        return productService.addProduct(product);
    }

    @GetMapping("/{productId}")
    public Product getProduct(@PathVariable("productId") int productId) {
        return productService.getProduct(productId);
    }

    @DeleteMapping("/{productId}")
    public HashMap<String, String> deleteProduct(@PathVariable("productId") int productId) {
        return BaseUtils.getResult(productService.deleteProduct(productId));
    }
}
