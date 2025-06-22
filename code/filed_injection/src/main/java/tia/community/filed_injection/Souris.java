package tia.community.filed_injection;

/**
 * @author Ezzaim Mohammed
 **/

public class Souris implements PeripheriqueUSB{

    @Override
    public void work() {
        System.out.println("The Souris fonctionne!");
    }
}
