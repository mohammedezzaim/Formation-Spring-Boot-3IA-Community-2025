package tia.community.lombok_tutorial.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import tia.community.lombok_tutorial.entity.Client;

/**
 * @author Mohammed Ezzaim
 **/
public interface ClientDao extends JpaRepository<Client, Integer> {
}
