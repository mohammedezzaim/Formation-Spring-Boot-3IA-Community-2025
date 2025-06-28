package tia.community.setter_injection;

import org.springframework.stereotype.Component;

/**
 * @author Ezzaim Mohammed
 **/

@Component
public class CleUSB implements PeripheriqueUSB{

    @Override
    public void work() {
        System.out.println("Cle USB est utiliser!");
    }
}
