package tia.community.couch_service_demo1.service;

import org.springframework.stereotype.Service;
import tia.community.couch_service_demo1.dao.ProductDao;
import tia.community.couch_service_demo1.entity.Product;

@Service
public class ProductService {

    private final ProductDao productDao;

    public ProductService(ProductDao productDao) {
        this.productDao = productDao;
    }

    public int save(Product product) {
       if (product.getName() == null || product.getPrice() == null) {
           return -1;
       }
       else {
           productDao.save(product);
           return 1;
       }
    }
}
