package com.mff.crudProject;

import com.mff.crudProject.dao.ProductDao;
import com.mff.crudProject.entity.Product;
import com.mff.crudProject.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class CrudProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ioc_container = SpringApplication.run(CrudProjectApplication.class, args);

		ProductService productService = ioc_container.getBean(ProductService.class);

//		Product p1 = new Product("Hp", 2000.0, "Laptop", true);
//		int check = productService.save(p1);
//		System.out.println(check);

		Product hpUpdate = new Product("Hp T500", 10000.0, "Laptop", true);
		productService.update(11, hpUpdate);



	}

}
