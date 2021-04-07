package cn.cyc.service.impl;

import cn.cyc.constant.ProductConstant;
import cn.cyc.mapper.ProductMapper;
import cn.cyc.model.Product;
import cn.cyc.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    ProductMapper productMapper;


    @Override
    public List<Product> getAllProduct() {
        return productMapper.getAll();
    }

    @Override
    public List<Product> getActiveProduct() {
        return productMapper.getActiveProduct();
    }

    @Override
    public boolean achievedProduct(int productId, int serviceId) {
        Product product = productMapper.selectByPrimaryKey(productId);
        product.setServiceid(serviceId);
        product.setStatus(ProductConstant.FINISHED);
        productMapper.updateByPrimaryKey(product);
        return true;
    }

    @Override
    public Product addProduct(Product product) {
        product.setStatus(ProductConstant.UNFINISHED);
        product.setDeleted(ProductConstant.ACTIVE);
        product.setCreate(System.currentTimeMillis());

        productMapper.insert(product);
        return product;
    }

    @Override
    public Product getProduct(int productId) {
        return productMapper.selectByPrimaryKey(productId);
    }

    @Override
    public boolean deleteProduct(int productId) {
        Product product = productMapper.selectByPrimaryKey(productId);
        product.setDeleted(ProductConstant.DELETED);
        productMapper.updateByPrimaryKey(product);
        return true;
    }
}
