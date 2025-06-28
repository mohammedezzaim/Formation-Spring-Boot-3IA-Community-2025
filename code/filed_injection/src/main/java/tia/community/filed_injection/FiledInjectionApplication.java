package tia.community.filed_injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.lang.reflect.Field;

@SpringBootApplication
public class FiledInjectionApplication {

	public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

		ApplicationContext ioc_container = SpringApplication.run(FiledInjectionApplication.class, args);


		Computer computer = ioc_container.getBean(Computer.class);
		PeripheriqueUSB cleUSB = ioc_container.getBean(CleUSB.class);

		Field portUSB = Computer.class.getDeclaredField("portUSB");
		portUSB.setAccessible(true);
		portUSB.set(computer, cleUSB);

		computer.utliserPeripheriqueUSB();

	}

}
