package ord;

import bean.PeripheriqueUSB;

/**
 * @author Ezzaim Mohammed
 **/

public class Ordinateur {
    private PeripheriqueUSB portUSB;

    public Ordinateur() {
    }

    public void utiliserPortUSB(){
        portUSB.work();
    }

    public void setPeripheriqueUSB(PeripheriqueUSB portUSB){
        this.portUSB = portUSB;
    }

}
