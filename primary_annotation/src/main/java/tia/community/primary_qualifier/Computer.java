package tia.community.primary_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Ezzaim Mohammed
 **/

@Component
public class Computer {

    @Autowired
    private PeripheriqueUSB portUSB;

    public Computer() {
        System.out.println("PC Worked!");
    }

    public void utliserPeripheriqueUSB() {
        portUSB.work();
    }
}