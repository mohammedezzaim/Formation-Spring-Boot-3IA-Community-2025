package tia.community.couch_service_demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import tia.community.couch_service_demo1.entity.Product;
import tia.community.couch_service_demo1.service.ProductService;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class CouchServiceDemo1Application {

	public static void main(String[] args) {
		ApplicationContext ioc_container = SpringApplication.run(CouchServiceDemo1Application.class, args);
		ProductService productService = ioc_container.getBean(ProductService.class);

//		Product lenovo = new Product("Lenovo T14", 10000.0, "Laptop", true, 10, LocalDate.now());
//		int check = productService.save(lenovo);
//		System.out.println(check);

//		List<Product> products = productService.findAll();
//
//		products.forEach(product -> {
//			System.out.println("--------------------------");
//			System.out.println(product.getId());
//			System.out.println(product.getName());
//			System.out.println(product.getPrice());
//			System.out.println(product.getCategory());
//		});

//
//		Product lenovoT14 = productService.findByName("Lenovo T15");
//		System.out.println("--------------------------");
//		System.out.println(lenovoT14.getId());
//		System.out.println(lenovoT14.getName());
//		System.out.println(lenovoT14.getPrice());
//		System.out.println(lenovoT14.getCategory());

//		List<Product> laptops = productService.findByCategory("Laptop");
//		for (Product product : laptops) {
//			System.out.println("--------------------------");
//			System.out.println(product.getId());
//			System.out.println(product.getName());
//			System.out.println(product.getPrice());
//			System.out.println(product.getCategory());
//			System.out.println("--------------------------");
//		}

		Product idEqualsOne = productService.findById(1);
		System.out.println("--------------------------");
		System.out.println(idEqualsOne.getId());
		System.out.println(idEqualsOne.getName());
		System.out.println(idEqualsOne.getPrice());
		System.out.println(idEqualsOne.getCategory());
		System.out.println("--------------------------");

	}

}
