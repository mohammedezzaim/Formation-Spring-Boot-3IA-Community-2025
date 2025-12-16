package com.mff.crudProject.dao;

import com.mff.crudProject.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Mohammed Ezzaim
 **/

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {
    Product findByName(String name);

    List<Product> findByCategory(String category);

    List<Product> findByPriceLessThan(double price);

    List<Product> findByPriceGreaterThan(double price);
}

