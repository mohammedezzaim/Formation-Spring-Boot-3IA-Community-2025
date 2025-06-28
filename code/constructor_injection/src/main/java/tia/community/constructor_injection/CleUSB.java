package tia.community.constructor_injection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Ezzaim Mohammed 
 * 3IA Community 
 **/

@Component
public class CleUSB implements PeripheriqueUSB{
    @Override
    public void work() {
        System.out.println("\uD83D\uDCBE Clé USB : Transfert de données en cours...");
    }

}
