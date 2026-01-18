package tia.community.couch_service_demo4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import tia.community.couch_service_demo4.entity.Product;
import tia.community.couch_service_demo4.service.ProductService;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@SpringBootApplication
public class CouchServiceDemo4Application {

	public static void main(String[] args) {
		ApplicationContext ioc_container = SpringApplication.run(CouchServiceDemo4Application.class, args);
		ProductService productService = ioc_container.getBean(ProductService.class);

		Product p1 = new Product("Lenovo T14", 5000.0, "Laptop", true, 10, LocalDate.of(2025,12,16));
		Product p2 = new Product("HP EliteBook", 1100.0, "Laptop", true, 8, LocalDate.of(2025,12,20));
		Product p3 = new Product("Dell XPS", 1500.0, "Laptop", true, 5, LocalDate.of(2025,12,20));
		Product p4 = new Product("Samsung Galaxy S23", 900.0, "Smartphone", true, 15, LocalDate.of(2025,12,20));
		Product p5 = new Product("iPhone 14 Pro", 13000.0, "Smartphone", true, 12, LocalDate.of(2025,12,20));

//		productService.save(p1);
//		productService.save(p2);
//		productService.save(p3);
//		productService.save(p4);
//		productService.save(p5);

		Map<String, Object> updates = new HashMap<>();
		updates.put("name", "Lenovo T100");
		updates.put("price", 10000.0);
		updates.put("dateCreation", LocalDate.of(2026, Month.JANUARY,18));

		int check = productService.partialUpdate("5aac5040-e941-4e07-8989-312dd1ccafb7", updates);
		System.out.println(check);

	}
}
