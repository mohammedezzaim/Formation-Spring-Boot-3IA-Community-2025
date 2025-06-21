package tia.community.primary_qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Ezzaim Mohammed
 **/

@Component
public class Souris implements PeripheriqueUSB{

    @Override
    public void work() {
        System.out.println("The Souris fonctionne!");
    }
}
