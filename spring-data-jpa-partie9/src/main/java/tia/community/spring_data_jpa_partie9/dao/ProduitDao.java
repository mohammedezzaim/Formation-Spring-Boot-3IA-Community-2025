package tia.community.spring_data_jpa_partie9.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tia.community.spring_data_jpa_partie9.entity.Produit;

import java.util.List;

@Repository
public interface ProduitDao extends JpaRepository<Produit, Integer> {

    @Query("""
            select p from Produit p where p.price > :minPrice
            """)
    List<Produit> findProductExpensive(@Param("minPrice") double prixMin);

    @Query("""
            select p from Produit p where YEAR(p.dateCreation) = :year and MONTH(p.dateCreation) = :month
            """)

    List<Produit> findProductByYearAndMonth(@Param("year") int anner, int month );
}
