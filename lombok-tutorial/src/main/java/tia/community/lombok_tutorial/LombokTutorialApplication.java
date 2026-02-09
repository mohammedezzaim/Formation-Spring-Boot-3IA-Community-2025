package tia.community.lombok_tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import tia.community.lombok_tutorial.dao.ClientDao;
import tia.community.lombok_tutorial.entity.Client;

import java.util.UUID;

@SpringBootApplication
public class LombokTutorialApplication {

	public static void main(String[] args) {
		ApplicationContext ioc_container = SpringApplication.run(LombokTutorialApplication.class, args);

		ClientDao clientDao = ioc_container.getBean(ClientDao.class);

		Client client = new Client(UUID.randomUUID().toString());
		client.setFirstName("3ia");
		client.setLastName("Community");
		client.setAddress("Marrakech Morocco Tranche 9, Lotissement Al Amal, Résidence Atlas Jardin, Bâtiment B, Appartement 12, Avenue Mohammed VI près du Grand Stade, Quartier M’hamid, à proximité du Centre Commercial, non loin de l’aéroport Menara, route de Targa, Commune Marrakech, Région Marrakech-Safi, Royaume du Maroc, Code postal 40000");
		clientDao.save(client);

		Client client2 = new Client(null, UUID.randomUUID().toString(), "mohammed", "ezzaim", "Marrakech Morocco Tranche 9");
		clientDao.save(client2);
	}

}
