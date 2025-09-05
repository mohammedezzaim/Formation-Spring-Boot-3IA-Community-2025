package tia.community.spring_data_jpa_partie9.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tia.community.spring_data_jpa_partie9.entity.Produit;

import java.util.List;

@Repository
public interface ProduitDao extends JpaRepository<Produit, Integer> {
    List<Produit> findByDisponibleTrue();
    List<Produit> findByDisponibleFalse();

    List<Produit> findByNameContaining(String partialName);
    List<Produit> findByNameStartingWith(String prefix);
    List<Produit> findByNameEndingWith(String suffix);

}
