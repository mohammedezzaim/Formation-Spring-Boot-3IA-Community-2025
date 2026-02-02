package tia.community.couch_service_demo4.service;

import org.springframework.stereotype.Service;
import tia.community.couch_service_demo4.dao.ProductDao;
import tia.community.couch_service_demo4.entity.Product;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class ProductService {

    private final ProductDao productDao;

    public ProductService(ProductDao productDao) {
        this.productDao = productDao;
    }

    public int save(Product product) {
       if (product.getName() == null || product.getPrice() == null) {
           return -1;
       } else if (productDao.findByName(product.getName()) != null) {
           return -2;
       }
       else {
           product.setRef(UUID.randomUUID().toString());
           productDao.save(product);
           return 1;
       }
    }

    public List<Product> findAll() {
        return productDao.findAll();
    }

    public Product findByName(String name) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("The argument not valid");
        } else {
            Product product = productDao.findByName(name);

            if (product == null) {
                throw new RuntimeException("The product is null");
            }

            return product;
        }
    }

    public List<Product> findByCategory(String category) {
        if (category == null || category.isBlank()) {
            throw new IllegalArgumentException("Category argument is not valid");
        } else {
            List<Product> products = productDao.findByCategory(category);

            if (products == null) {
                throw new RuntimeException("No Product found in this category");
            }

            return products;
        }
    }

    public Product findById(Integer id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Product ID is not valid");
        }

        Product product = productDao.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not exists"));

        return product;
    }

    public int update(String refCurrentProduct, Product nvProduct) {
        if (refCurrentProduct == null || refCurrentProduct.isBlank() || nvProduct == null) {
            return -1;
        } else {
            Product currentProduct = productDao.findByRef(refCurrentProduct);

            if (currentProduct == null) {
                return -2;
            }
            currentProduct.setName(nvProduct.getName());
            currentProduct.setPrice(nvProduct.getPrice());
            currentProduct.setCategory(nvProduct.getCategory());
            currentProduct.setDisponible(nvProduct.isDisponible());
            currentProduct.setStock(nvProduct.getStock());
            currentProduct.setDateCreation(nvProduct.getDateCreation());

            productDao.save(currentProduct);
            return 1;

        }
    }


    public int partialUpdate(String refCurrentProduct, Map<String, Object> updates) {
        if (refCurrentProduct == null || refCurrentProduct.isBlank() || updates == null) {
            return -1;
        } else {
            Product currentProduct = productDao.findByRef(refCurrentProduct);

            if (currentProduct == null) {
                return -2;
            }

            if (updates.containsKey("name")) {
                currentProduct.setName((String) updates.get("name"));
            }

            if (updates.containsKey("price")) {
                currentProduct.setPrice((Double) updates.get("price"));
            }

            if (updates.containsKey("category")) {
                currentProduct.setCategory((String) updates.get("category"));
            }

            if (updates.containsKey("disponible")) {
                currentProduct.setDisponible((boolean) updates.get("disponible"));
            }

            if (updates.containsKey("stock")) {
                currentProduct.setStock((int) updates.get("stock"));
            }
            if (updates.containsKey("dateCreation")) {
                currentProduct.setDateCreation((LocalDate) updates.get("dateCreation"));
            }

            productDao.save(currentProduct);
            return 1;
        }
    }

    public void delete(String refCurrentProduct) {
        Product currentProduct = productDao.findByRef(refCurrentProduct);
        if (currentProduct != null)
        {
            productDao.delete(currentProduct);
        }
    }

    public void deleteAllByRefs(String... refs) {
        for (String ref: refs) {
            delete(ref);
        }
    }

    public void deleteAllByCategory(String category) {
        List<Product> products = productDao.findByCategory(category);
        productDao.deleteAll(products);
    }

    public void deleteAll() {
        productDao.deleteAll();
    }
}
