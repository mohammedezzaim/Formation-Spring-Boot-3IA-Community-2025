package tia.community.primary_qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Ezzaim Mohammed
 **/

@Component
@Qualifier
public class Souris implements PeripheriqueUSB{

    @Override
    public void work() {
        System.out.println("The Souris fonctionne!");
    }
}
