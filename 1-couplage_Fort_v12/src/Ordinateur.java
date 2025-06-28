/**
 * @author Ezzaim Mohammed
 **/
public class Ordinateur {
    private final Clavier portUSB;

    public Ordinateur() {
        this.portUSB = new Clavier(); // Couplage fort: création directe de l'objet CleUSB
    }

    public void utiliserPortUSB(){
        portUSB.work();
    }
}
