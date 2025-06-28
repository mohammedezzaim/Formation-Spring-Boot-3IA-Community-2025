package tia.community.primary_qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Ezzaim Mohammed
 **/

@Component
@Primary
public class CleUSB implements PeripheriqueUSB{

    @Override
    public void work() {
        System.out.println("Cle USB est utiliser!");
    }
}