package tia.community.couch_service_demo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
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
public class CouchServiceDemo4Application implements CommandLineRunner {

	private static ApplicationContext ioc_container ;

	@Autowired
	private ProductService productService;

	public static void main(String[] args) {
		ioc_container = SpringApplication.run(CouchServiceDemo4Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Product p1 = new Product("Lenovo T14", 5000.0, "Laptop", true, 10, LocalDate.of(2025,12,16));
		Product p2 = new Product("HP EliteBook", 1100.0, "Laptop", true, 8, LocalDate.of(2025,12,20));
		Product p3 = new Product("Dell XPS", 1500.0, "Laptop", true, 5, LocalDate.of(2025,12,20));
		Product p4 = new Product("Samsung Galaxy S23", 900.0, "Smartphone", true, 15, LocalDate.of(2025,12,20));
		Product p5 = new Product("iPhone 14 Pro", 13000.0, "Smartphone", true, 12, LocalDate.of(2025,12,20));


		productService.save(p1);
		productService.save(p2);
		productService.save(p3);
		productService.save(p4);
		productService.save(p5);
	}
}
