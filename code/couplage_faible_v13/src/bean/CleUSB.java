package bean;

/**
 * @author Ezzaim Mohammed
 **/

public class CleUSB implements PeripheriqueUSB{
    @Override
    public void work() {
        System.out.println("Le Cle USB fonctionne");
    }
}
