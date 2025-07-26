package tia.community.SpringDataJpa1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import tia.community.SpringDataJpa1.dao.ProduitDao;
import tia.community.SpringDataJpa1.entity.Produit;

import java.time.LocalDate;
import java.util.List;


@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {
		ApplicationContext ioc_container = SpringApplication.run(SpringDataJpa1Application.class, args);

		ProduitDao produitDao = ioc_container.getBean(ProduitDao.class);

		//save
		Produit produit1 = new Produit(null, "Lenovo", 10000.0, "electronique", true, 100, LocalDate.now());
		produitDao.save(produit1);

		Produit produit2 = new Produit(null, "HP", 9000.0, "electronique", true, 2, LocalDate.now());
		produitDao.save(produit2);

		// findById
		Produit foundProduit = produitDao.findById(1L).get();
		System.out.println(foundProduit);

		// findAll()
		List<Produit> produits = produitDao.findAll();
		System.out.println("*************************************************");
		for (Produit produit: produits) {
			System.out.println(produit);
		}
		System.out.println("*************************************************");

		// deleteById
		produitDao.deleteById(2L);

		// delete
		Produit deleteProduit = produitDao.findById(1L).get();
		produitDao.delete(deleteProduit);

		// count
		Produit produit3 = new Produit(null, "Mac", 100000.0, "electronique", true, 5, LocalDate.now());
		produitDao.save(produit1);

		Produit produit4 = new Produit(null, "Dell", 9000.0, "electronique", true, 50, LocalDate.now());
		produitDao.save(produit2);

		Long countProduct = produitDao.count();
		System.out.println("Nomber de produit est: "+ countProduct);


	}

}
