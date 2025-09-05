package tia.community.spring_data_jpa_partie9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import tia.community.spring_data_jpa_partie9.dao.ProduitDao;
import tia.community.spring_data_jpa_partie9.entity.Produit;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class SpringDataJpaPartie9Application {

	public static void main(String[] args) {
		ApplicationContext ioc_container = SpringApplication.run(SpringDataJpaPartie9Application.class, args);
		ProduitDao produitDao = ioc_container.getBean(ProduitDao.class);

		Produit p1 = new Produit(null, "Sony Earphone", 250.0, "Accessory", true, 120, LocalDate.now());
		Produit p2 = new Produit(null, "Dell PC", 8500.0, "Computer", false, 35, LocalDate.now());
		Produit p3 = new Produit(null, "Samsung Galaxy S22", 4200.0, "Phone", false, 0, LocalDate.now());
		Produit p4 = new Produit(null, "iPhone 14 Pro", 11000.0, "Phone", true, 10, LocalDate.now());
		Produit p5 = new Produit(null, "Lenovo PC", 2500.0, "Computer", true, 10, LocalDate.now());
		Produit p6 = new Produit(null, "Samsung Galaxy S22 Pro", 4500.0, "Phone", true, 5, LocalDate.now());
		Produit p7 = new Produit(null, "iPhone 15 Pro", 12000.0, "Phone", true, 8, LocalDate.now());
		Produit p8 = new Produit(null, "Galaxy 15", 12000.0, "Phone", true, 8, LocalDate.now());
		Produit p9 = new Produit(null, "OPPO Galaxy", 12000.0, "Phone", true, 8, LocalDate.now());

		produitDao.save(p1);
		produitDao.save(p2);
		produitDao.save(p3);
		produitDao.save(p4);
		produitDao.save(p5);
		produitDao.save(p6);
		produitDao.save(p7);
		produitDao.save(p8);
		produitDao.save(p9);

		System.out.println("\n");
		System.out.println("product disponible");
		List<Produit> productDispo = produitDao.findByDisponibleTrue();
		productDispo.stream().forEach(
				produit -> System.out.println(produit.affaiche())
		);

		System.out.println("\n");
		System.out.println("product not disponible");
		List<Produit> productNotDipo = produitDao.findByDisponibleFalse();
		productNotDipo.stream().forEach(
				produit -> System.out.println(produit.affaiche())
		);

		System.out.println("\n");
		System.out.println("product Galaxy");
		List<Produit> productGalaxy = produitDao.findByNameContaining("Galaxy");
		productGalaxy.stream().forEach(
				produit -> System.out.println(produit.affaiche())
		);


		System.out.println("\n");
		System.out.println("product Samsung");
		List<Produit> productSamsung = produitDao.findByNameStartingWith("Samsung");
		productSamsung.stream().forEach(
				produit -> System.out.println(produit.affaiche())
		);

		System.out.println("\n");
		System.out.println("product Pro");
		List<Produit> productPro = produitDao.findByNameEndingWith("Pro");
		productPro.stream().forEach(
				produit -> System.out.println(produit.affaiche())
		);

	}

}
