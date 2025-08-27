package tia.community.SpringDataJpa1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import tia.community.SpringDataJpa1.dao.ProduitDao;
import tia.community.SpringDataJpa1.entity.Produit;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;


@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {
		ApplicationContext ioc_container = SpringApplication.run(SpringDataJpa1Application.class, args);

		ProduitDao bean = ioc_container.getBean(ProduitDao.class);

		Produit p1 = new Produit(null, "HP", 9000.0, "electronique", true, 200, LocalDate.of(2025, 7, 20));
		Produit p2 = new Produit(null, "HP", 4000.0, "electronique", false, 0, LocalDate.of(2025, 4, 2));
		Produit p3 = new Produit(null, "Lenovo", 10000.0, "electronique", true, 40, LocalDate.of(2025, 7, 21));
		Produit p4 = new Produit(null, "Mac", 20000.0, "electronique", true, 40, LocalDate.of(2025, 7, 22));


		Produit p5 = new Produit(null, "Chaise de bureau", 1200.0, "mobilier", true, 300, LocalDate.of(2025, 7, 23));
		Produit p6 = new Produit(null, "Réfrigérateur", 5000.0, "électroménager", true, 50, LocalDate.of(2025, 7, 24));

		bean.save(p1);
		bean.save(p2);
		bean.save(p3);
		bean.save(p4);
		bean.save(p5);
		bean.save(p6);

		Produit hpDispo = bean.findByNameAndDisponible("HP", true);

		System.out.println("\n\n");
		System.out.println("---------------------------------3IA Community---------------------------------");
		Produit hpNotDispo = bean.findByNameAndDisponible("HP", false);
		System.out.println(hpNotDispo);

		System.out.println("\n");
		System.out.println("electronique");
		List<Produit> produits = bean.findByCategory("electronique");
		Stream<Produit> produitStream =  produits.stream();
		produitStream.forEach(produit -> System.out.println(produit.toString()));

		System.out.println("\n");
		System.out.println("electronique and non dispo");
		List<Produit> dispoProducts =  bean.findByCategoryAndDisponible("electronique", false);
		dispoProducts.stream().forEach(
				produit -> System.out.println(produit.toString())
		);

		System.out.println("\n");
		System.out.println("Electronique and stock = 40");
		List<Produit> produitList = bean.findByCategoryAndStock("electronique", 40);
		produitList.stream().forEach(p-> System.out.println(p.toString()));
	}

}
