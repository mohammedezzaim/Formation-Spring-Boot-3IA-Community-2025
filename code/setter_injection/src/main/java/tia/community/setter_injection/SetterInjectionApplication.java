package tia.community.setter_injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SetterInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ioc_container = SpringApplication.run(SetterInjectionApplication.class, args);

		Computer c = ioc_container.getBean(Computer.class);
//		c.utliserPeripheriqueUSB();

		PeripheriqueUSB souris = new Souris();

		c.setPortUSB(souris);
		c.utliserPeripheriqueUSB();

	}

}
