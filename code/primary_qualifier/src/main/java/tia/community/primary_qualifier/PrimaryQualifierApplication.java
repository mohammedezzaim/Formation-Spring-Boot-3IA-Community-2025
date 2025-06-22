package tia.community.primary_qualifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.lang.reflect.Field;

@SpringBootApplication
public class PrimaryQualifierApplication {

	public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

		ApplicationContext ioc_container = SpringApplication.run(PrimaryQualifierApplication.class, args);


		Computer computer = ioc_container.getBean(Computer.class);
		computer.utliserPeripheriqueUSB();

	}

}
