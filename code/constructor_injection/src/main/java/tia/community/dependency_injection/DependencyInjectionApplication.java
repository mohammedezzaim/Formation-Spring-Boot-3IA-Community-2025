package tia.community.dependency_injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ioc_container = SpringApplication.run(DependencyInjectionApplication.class, args);

		PeripheriqueUSB cleUSB = ioc_container.getBean(CleUSB.class);
		Computer computer = ioc_container.getBean(Computer.class);
		computer.utliserPeripheriqueUSB();
	}

}
