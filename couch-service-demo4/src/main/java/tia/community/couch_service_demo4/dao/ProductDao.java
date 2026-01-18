package tia.community.couch_service_demo4.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tia.community.couch_service_demo4.entity.Product;

import java.util.List;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {
    Product findByName(String name);
    List<Product> findByCategory(String category);
    Product findByRef(String ref);
}
