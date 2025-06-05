package bean;

/**
 * @author Ezzaim Mohammed
 **/
public class Clavier implements PeripheriqueUSB{
    @Override
    public void work() {
        System.out.println("La clavier fonctionne");
    }
}
