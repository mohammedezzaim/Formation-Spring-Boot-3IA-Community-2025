package tia.community.dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Ezzaim Mohammed
 **/

@Component
public class Computer {
    private PeripheriqueUSB portUSB;

    @Autowired
    public Computer(PeripheriqueUSB portUSB) {
        this.portUSB = portUSB;
    }

    public Computer() {
        System.out.println("\uD83D\uDDA5\uFE0F worked!");
    }

    public void utliserPeripheriqueUSB(){
        System.out.println("\uD83D\uDD0C Périphérique connecté au port USB :");
        portUSB.work();
    }
}
