package tia.community.spring_data_jpa_partie8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import tia.community.spring_data_jpa_partie8.dao.ProduitDao;
import tia.community.spring_data_jpa_partie8.entity.Produit;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class SpringDataJpaPartie8Application {

	public static void main(String[] args) {
		ApplicationContext ioc_container = SpringApplication.run(SpringDataJpaPartie8Application.class, args);
		ProduitDao produitDao = ioc_container.getBean(ProduitDao.class);

		Produit p1 = new Produit(null, "Sony Earphone", 250.0, "Accessory", true, 120, LocalDate.now());
		Produit p2 = new Produit(null, "Dell PC", 8500.0, "Computer", false, 35, LocalDate.now());
		Produit p3 = new Produit(null, "Samsung Galaxy S22", 4200.0, "Phone", false, 0, LocalDate.now());
		Produit p4 = new Produit(null, "iPhone 14 Pro", 11000.0, "Phone", true, 10, LocalDate.now());
		Produit p5 = new Produit(null, "Lenovo PC", 2500.0, "Computer", true, 10, LocalDate.now());
		Produit p6 = new Produit(null, "Samsung Galaxy S22 Pro", 4500.0, "Phone", true, 5, LocalDate.now());
		Produit p7 = new Produit(null, "iPhone 15 Pro", 12000.0, "Phone", true, 8, LocalDate.now());


//		produitDao.save(p1);
//		produitDao.save(p2);
//		produitDao.save(p3);
//		produitDao.save(p4);
//		produitDao.save(p5);
//		produitDao.save(p6);
//		produitDao.save(p7);


		System.out.println();
		System.out.println("Produit Price GreaterThan 5000");
		List<Produit> produitPriceGreaterThan5000 = produitDao.findByPriceGreaterThan(5000);

		produitPriceGreaterThan5000.stream().forEach(
				p-> System.out.println(p.affaiche())
		);

		System.out.println();
		System.out.println("Produit Price LessThan 3000");
		List<Produit> produitPriceLessThan3000 = produitDao.findByPriceLessThan(3000);
		produitPriceLessThan3000.stream().forEach(
				p-> System.out.println(p.affaiche())
		);

		System.out.println();
		System.out.println("Produit Price Between 4000 and 12000");
		List<Produit> produitPriceBetween4000And12000 = produitDao.findByPriceBetween(4000,12000);
		produitPriceBetween4000And12000.stream().forEach(
				p-> System.out.println(p.affaiche())
		);

	}

}
