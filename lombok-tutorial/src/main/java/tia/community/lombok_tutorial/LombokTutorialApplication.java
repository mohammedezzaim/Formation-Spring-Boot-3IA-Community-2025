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

		Client client1 = new Client(UUID.randomUUID().toString(), "3ia", "Community", "Marrakech Morocco Tranche 9, Lotissement Al Amal, Résidence Atlas Jardin, Bâtiment B, Appartement 12, Avenue Mohammed VI près du Grand Stade, Quartier M’hamid, à proximité du Centre Commercial, non loin de l’aéroport Menara, route de Targa, Commune Marrakech, Région Marrakech-Safi, Royaume du Maroc, Code postal 40000");
		clientDao.save(client1);

		Client client2 = new Client(UUID.randomUUID().toString(), "3ia", "Community", "Marrakech Morocco Tranche 9, Lotissement Al Amal, Résidence Atlas Jardin, Bâtiment B, Appartement 12, Avenue Mohammed VI près du Grand Stade, Quartier M’hamid, à proximité du Centre Commercial, non loin de l’aéroport Menara, route de Targa, Commune Marrakech, Région Marrakech-Safi, Royaume du Maroc, Code postal 40000");
		clientDao.save(client2);

		if (client1.equals(client2)) {
			System.out.println("The Both Client have The same characteristic");
		} else {
			System.out.println("!=");
		}

		System.out.println("hashCode Client 1:"+ client1.hashCode());
		System.out.println("hashCode Client 2:"+ client2.hashCode());

	}

}
