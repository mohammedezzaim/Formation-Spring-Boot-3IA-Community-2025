package tia.community.dependency_injection;

import org.springframework.stereotype.Component;

/**
 * @author Ezzaim Mohammed
 **/

@Component
public class CleUSB implements PeripheriqueUSB{
    @Override
    public void work() {
        System.out.println("\uD83D\uDCBE Clé USB : Transfert de données en cours...");
    }

}
