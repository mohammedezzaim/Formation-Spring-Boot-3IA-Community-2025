package tia.community.SpringDataJpa1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tia.community.SpringDataJpa1.entity.Produit;

@Repository
public interface ProduitDao extends JpaRepository<Produit, Long> {

}
