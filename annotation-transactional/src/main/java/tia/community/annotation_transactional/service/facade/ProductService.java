package tia.community.annotation_transactional.service.facade;


import tia.community.annotation_transactional.entity.Product;

import java.util.List;
import java.util.Map;

/**
 * @author Mohammed Ezzaim
 **/

public interface ProductService {

    /**
     * This Methode for Add new Product
     * @param product with Type Product
     * @return int with 3 option:
     *              1 = Success
     *             -1 = data invalid
     *             -2 = This product already exist
     * @throws NullPointerException id product equals nul
     */

    int save(Product product);

    List<Product> findAll();

    Product findByName(String name);

    List<Product> findByCategory(String category);

    Product findById(Integer id);

    int update(String refCurrentProduct, Product nvProduct);

    int partialUpdate(String refCurrentProduct, Map<String, Object> updates);

    void delete(String refCurrentProduct);

    void deleteAllByRefs(String... refs);

    void deleteAllByCategory(String category);

     void deleteAll();

}
