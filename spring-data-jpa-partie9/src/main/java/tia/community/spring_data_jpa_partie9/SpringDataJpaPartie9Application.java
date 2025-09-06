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

		Produit p1 = new Produit(null, "Sony Earphone", 250.0, "Accessory", true, 120, LocalDate.of(2025, 1, 2));
		Produit p2 = new Produit(null, "Dell PC", 8500.0, "Computer", false, 35, LocalDate.of(2025, 1, 2 ));
		Produit p3 = new Produit(null, "Samsung Galaxy S22", 4200.0, "Phone", false, 0, LocalDate.of(2025, 6, 1));
		Produit p4 = new Produit(null, "iPhone 14 Pro", 11000.0, "Phone", true, 10, LocalDate.of(2025, 9, 1));
		Produit p5 = new Produit(null, "Lenovo PC", 2500.0, "Computer", true, 10, LocalDate.of(2025, 9, 4));
		Produit p6 = new Produit(null, "Samsung Galaxy S22 Pro", 4500.0, "Phone", true, 5, LocalDate.of(2025, 8, 3));
		Produit p7 = new Produit(null, "iPhone 15 Pro", 12000.0, "Phone", true, 8, LocalDate.of(2025, 9, 7));

		produitDao.save(p1);
		produitDao.save(p2);
		produitDao.save(p3);
		produitDao.save(p4);
		produitDao.save(p5);
		produitDao.save(p6);
		produitDao.save(p7);

		System.out.println("\n");
		System.out.println("Expensive Product:");
		List<Produit> expensiveProduct = produitDao.findProductExpensive(10000);
		expensiveProduct.stream().forEach(
				produit -> System.out.println(produit.affaiche())
		);


		System.out.println("\n");
		System.out.println("Product in Year = 2025 and Month = 9");
		List<Produit> productYear2025Month9 = produitDao.findProductByYearAndMonth(2025, 9);
		productYear2025Month9.stream().forEach(
				produit -> System.out.println(produit.affaicheWithDate())
		);


	}

}
