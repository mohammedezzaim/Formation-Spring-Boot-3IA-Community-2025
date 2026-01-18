package tia.community.couch_service_demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import tia.community.couch_service_demo1.entity.Product;
import tia.community.couch_service_demo1.service.ProductService;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class CouchServiceDemo1Application {

	public static void main(String[] args) {
		ApplicationContext ioc_container = SpringApplication.run(CouchServiceDemo1Application.class, args);
		ProductService productService = ioc_container.getBean(ProductService.class);

		Product updateIphone = new Product("iPhone 15", 15000.0, null, false, 0, null);

		int check  = productService.update("6c594c40-bdec-400a-8262-7894b9a0d8f9", updateIphone);
		System.out.println(check);

	}
}
