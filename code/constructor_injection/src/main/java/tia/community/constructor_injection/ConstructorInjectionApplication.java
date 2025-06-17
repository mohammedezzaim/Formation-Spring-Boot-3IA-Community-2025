package tia.community.constructor_injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ConstructorInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ioc_container = SpringApplication.run(ConstructorInjectionApplication.class, args);

		Computer computer = ioc_container.getBean(Computer.class);
		computer.utliserPeripheriqueUSB();
	}

}
