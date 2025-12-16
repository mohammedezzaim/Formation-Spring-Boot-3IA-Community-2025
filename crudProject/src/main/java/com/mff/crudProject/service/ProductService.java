package com.mff.crudProject.service;

import com.mff.crudProject.dao.ProductDao;
import com.mff.crudProject.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mohammed Ezzaim
 **/

@Service
public class ProductService {


    @Autowired
    private ProductDao productDao;

    public int save(Product product) {
        if (product.getName() == null || product.getPrice() == null || product.getCategory() ==null) {
            return -1;
        } else if (productDao.findByName(product.getName()) != null) {
            return -2;
        }else {
            productDao.save(product);
            return 1;
        }
    }

    public void update(Integer id, Product nvproduct) {
        Product productInDB = productDao.findById(id).orElseThrow();
        productInDB.setName(nvproduct.getName());
        productInDB.setPrice(nvproduct.getPrice());
        productInDB.setCategory(nvproduct.getCategory());
        productInDB.setDispo(nvproduct.isDispo());

        productDao.save(productInDB);
        }

    public Product findByName(String name) {
        return productDao.findByName(name);
    }

    public List<Product> findByCategory(String category) {
        return productDao.findByCategory(category);
    }

    public List<Product> findByPriceLessThan(double price) {
        return productDao.findByPriceLessThan(price);
    }

    public List<Product> findByPriceGreaterThan(double price) {
        return productDao.findByPriceGreaterThan(price);
    }

    public List<Product> findAll() {
        return productDao.findAll();
    }
}
