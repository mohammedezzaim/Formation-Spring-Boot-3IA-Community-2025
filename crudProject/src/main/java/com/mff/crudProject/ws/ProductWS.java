package com.mff.crudProject.ws;

import com.mff.crudProject.entity.Product;
import com.mff.crudProject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Mohammed Ezzaim
 **/

@RestController
@RequestMapping("/api/products/")
public class ProductWS {

    private final ProductService productService;

    @Autowired
    public ProductWS(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("save")
    public int save(@RequestBody Product product) {
        return productService.save(product);
    }

    @PutMapping("/update/{id}")
    public void update(@PathVariable Integer id, @RequestBody Product nvproduct) {
        productService.update(id, nvproduct);
    }

    @GetMapping("getProduct/{name}")
    public Product findByName(@PathVariable String name) {
        return productService.findByName(name);
    }

    @GetMapping("findByCategory/{category}")
    public List<Product> findByCategory(@PathVariable String category) {
        return productService.findByCategory(category);
    }

    public List<Product> findByPriceLessThan(double price) {
        return productService.findByPriceLessThan(price);
    }

    public List<Product> findByPriceGreaterThan(double price) {
        return productService.findByPriceGreaterThan(price);
    }

    @GetMapping("findAll")
    public List<Product> findAll() {
        return productService.findAll();
    }


}
