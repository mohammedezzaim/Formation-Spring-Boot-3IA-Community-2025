package tia.community.setter_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Ezzaim Mohammed
 **/

@Component
public class Computer {

    private PeripheriqueUSB portUSB;

    public Computer() {
        System.out.println("PC Worked!");
    }

    @Autowired
    public void setPortUSB(PeripheriqueUSB portUSB) {
        this.portUSB = portUSB;
    }

    public void utliserPeripheriqueUSB() {
        portUSB.work();
    }
}
