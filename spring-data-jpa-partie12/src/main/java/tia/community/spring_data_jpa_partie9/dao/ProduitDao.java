package tia.community.spring_data_jpa_partie9.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tia.community.spring_data_jpa_partie9.entity.Produit;

import java.util.List;

@Repository
public interface ProduitDao extends JpaRepository<Produit, Integer> {

   @Query(value = """
           select * from produits where price >= :minPrice
           """, nativeQuery = true)
   List<Produit> findProductExpensive(double minPrice);


   @Query(value = """
           select * from produits where DATE_FORMAT(date_creation, '%Y-%m') = :yearAndMonth
           """, nativeQuery = true)
   List<Produit> findProductByYearAndMonth(String yearAndMonth);
}
