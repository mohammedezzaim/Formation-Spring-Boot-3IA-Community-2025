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

		ProduitDao bean = ioc_container.getBean(ProduitDao.class);

		Produit p1 = new Produit(null, "HP", 9000.0, "electronique", true, 200, LocalDate.of(2025, 7, 20));
		Produit p2 = new Produit(null, "Lenovo", 10000.0, "electronique", true, 100, LocalDate.of(2025, 7, 21));
		Produit p3 = new Produit(null, "Mac", 20000.0, "electronique", true, 40, LocalDate.of(2025, 7, 22));
		Produit p4 = new Produit(null, "Chaise de bureau", 1200.0, "mobilier", true, 300, LocalDate.of(2025, 7, 23));
		Produit p5 = new Produit(null, "Réfrigérateur", 5000.0, "électroménager", true, 50, LocalDate.of(2025, 7, 24));

		bean.save(p1);
		bean.save(p2);
		bean.save(p3);
		bean.save(p4);
		bean.save(p5);

		Produit foundProduit = bean.findByName("HP");
		System.out.println(foundProduit.toString());

		List<Produit> electronic = bean.findByCategory("electronique") ;

		System.out.println("electronique product");
		for (Produit p: electronic){
			System.out.println("---------------------------------------------");
			System.out.println(p.toString());
		}

		List<Produit> mobilier = bean.findByCategory("mobilier") ;

		System.out.println("mobilier product");
		for (Produit p: electronic){
			System.out.println("---------------------------------------------");
			System.out.println(p.toString());
		}


	}

}
