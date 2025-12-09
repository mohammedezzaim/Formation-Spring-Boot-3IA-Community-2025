package tia.community.couch_service_demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import tia.community.couch_service_demo1.entity.Product;
import tia.community.couch_service_demo1.service.ProductService;

import java.time.LocalDate;

@SpringBootApplication
public class CouchServiceDemo1Application {

	public static void main(String[] args) {
		ApplicationContext ioc_container = SpringApplication.run(CouchServiceDemo1Application.class, args);
		ProductService productService = ioc_container.getBean(ProductService.class);

		Product lenovo = new Product("Lenovo T14", null, "Laptop", true, 10, LocalDate.now());
		int check = productService.save(lenovo);
		System.out.println(check);

	}

}
