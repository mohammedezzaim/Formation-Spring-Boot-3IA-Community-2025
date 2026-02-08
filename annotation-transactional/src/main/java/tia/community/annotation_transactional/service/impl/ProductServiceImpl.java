package tia.community.annotation_transactional.service.impl;

import org.springframework.data.domain.Auditable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tia.community.annotation_transactional.dao.ProductDao;
import tia.community.annotation_transactional.entity.Product;
import tia.community.annotation_transactional.service.facade.ProductService;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    private final ProductDao productDao;

    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }


    @Override
    public int save(Product product) {
        if (product.getName() == null || product.getPrice() == null) {
            return -1;
        } else if (productDao.findByName(product.getName()) != null) {
            return -2;
        } else {
            product.setRef(UUID.randomUUID().toString());
            productDao.save(product);
            return 1;
        }
    }

    @Transactional(readOnly = true)
    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }

    @Transactional(readOnly = true)
    @Override
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

    @Transactional(readOnly = true)
    @Override
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

    @Transactional(readOnly = true)
    @Override
    public Product findById(Integer id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Product ID is not valid");
        }

        Product product = productDao.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not exists"));

        return product;
    }

    @Override
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


    @Override
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

    @Override
    public void delete(String refCurrentProduct) {
        Product currentProduct = productDao.findByRef(refCurrentProduct);
        if (currentProduct != null) {
            productDao.delete(currentProduct);
        }
    }


    @Override
    public void deleteAllByRefs(String... refs) {
        for (String ref : refs) {

            if (ref.equals("2c076729-b7d4-4a39-96d7-663ccb946992")){
                System.out.println("=================================");
                System.out.println("Stop DB Mysql");
                try {
                    Thread.sleep(15000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("=================================");
            }
            delete(ref);
        }
    }

    @Override
    public void deleteAllByCategory(String category) {
        List<Product> products = productDao.findByCategory(category);
        productDao.deleteAll(products);
    }


    @Override
    public void deleteAll() {
        productDao.deleteAll();
    }
}