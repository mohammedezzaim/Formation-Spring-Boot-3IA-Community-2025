package tia.community.lombok_tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import tia.community.lombok_tutorial.dao.ClientDao;
import tia.community.lombok_tutorial.dao.CommandDao;
import tia.community.lombok_tutorial.entity.Client;
import tia.community.lombok_tutorial.entity.Command;

import java.util.UUID;

@SpringBootApplication
public class LombokTutorialApplication {

	public static void main(String[] args) {
		ApplicationContext ioc_container = SpringApplication.run(LombokTutorialApplication.class, args);

		ClientDao clientDao = ioc_container.getBean(ClientDao.class);

		Client tia_community = Client.builder()
				.ref(UUID.randomUUID().toString())
				.firstName("3ia")
				.lastName("community")
				.address("Marrakech Morocco")
				.role("SUPER_CLIENT")
				.build();

		Client mohammed = Client.builder()
				.ref(UUID.randomUUID().toString())
				.firstName("mohammed")
				.lastName("mohammed")
				.address("Marrakech Morocco")
				.build();

		clientDao.save(tia_community);
		clientDao.save(mohammed);

	}

}
