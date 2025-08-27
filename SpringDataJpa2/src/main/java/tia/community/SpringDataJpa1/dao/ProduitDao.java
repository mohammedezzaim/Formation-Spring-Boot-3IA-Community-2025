package tia.community.SpringDataJpa1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tia.community.SpringDataJpa1.entity.Produit;

import java.util.List;

@Repository
public interface ProduitDao extends JpaRepository<Produit, Long> {
   Produit findByName(String name);
   List<Produit> findByCategory(String category);

   Produit findByNameAndDisponible(String name, boolean disponible);

   List<Produit> findByCategoryAndDisponible(String category, boolean disponible);

   List<Produit> findByCategoryAndStock(String category, int stock);

}
