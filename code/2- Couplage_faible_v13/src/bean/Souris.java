package bean;

/**
 * @author Ezzaim Mohammed
 **/
public class Souris implements PeripheriqueUSB{
    @Override
    public void work() {
        System.out.println("Souris fonctionne");
    }
}
