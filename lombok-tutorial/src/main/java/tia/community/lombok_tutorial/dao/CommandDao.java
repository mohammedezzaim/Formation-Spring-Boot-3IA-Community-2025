package tia.community.lombok_tutorial.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import tia.community.lombok_tutorial.entity.Command;

/**
 * @author Mohammed Ezzaim
 **/
public interface CommandDao extends JpaRepository<Command, Integer> {
}
