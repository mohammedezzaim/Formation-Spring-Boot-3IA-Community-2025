package tia.community.spring_data_jpa_partie8.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tia.community.spring_data_jpa_partie8.entity.Produit;

import java.util.List;

@Repository
public interface ProduitDao extends JpaRepository<Produit, Integer> {
    List<Produit> findByPriceGreaterThan(double price);

    List<Produit> findByPriceLessThan(double price);

    List<Produit> findByPriceBetween(double minPrice, double maxPrice);
}
