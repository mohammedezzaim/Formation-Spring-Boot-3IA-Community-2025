package tia.community.primary_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
=======
import org.springframework.beans.factory.annotation.Qualifier;
>>>>>>> code/DI_qualifier_annotation
import org.springframework.stereotype.Component;

/**
 * @author Ezzaim Mohammed
 **/

@Component
public class Computer {

<<<<<<< HEAD
    @Autowired
    private PeripheriqueUSB portUSB;

=======

    @Autowired
    @Qualifier("stockage")
    private PeripheriqueUSB portUSB;


>>>>>>> code/DI_qualifier_annotation
    public Computer() {
        System.out.println("PC Worked!");
    }

    public void utliserPeripheriqueUSB() {
        portUSB.work();
    }
}